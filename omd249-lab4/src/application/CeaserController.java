/*
 * THERESA CRAWFORD
 * OMD249
 * 
 * This class contains task 2: the class controller, which holds the Ceaser code that will be called and computed 
 * 		when the button is pressed.
 */
package application;
//test new
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class CeaserController {
	private int N = 23;
	@FXML private TextField plainTxt;
	@FXML private TextField encrypted;	
	
	//this method encrypts the plainTxt TextField when the ActionEvent(button press) occurs
	@FXML 
	private void encrypt(ActionEvent event) {							
		String originalStr = plainTxt.getText();		//GRAB THE TEXT FROM TEXT FIELD
		//--------------------LAB 2 CODE WITH UPDATED STRING NAME--------------------
		String encryption = "";													//Initialize new string to concat encryption onto
		for(int i=0; i<originalStr.length(); ++i) {								//increment through the string
			char c=originalStr.charAt(i);										//set c to current string character
			if(Character.isLetter(c)) {											//if c is a letter, perform cipher shift	
				if(Character.isLowerCase(c)) {																	
					c += N;														//cipher shift c
					if(c > 'z'|| c < 'a') {										//if lower case c is not in the alphabet anymore
						encryption += (char)(originalStr.charAt(i) - (26-N));	//set encryption to current char minus (alphabet size minus cipher shift)
					}
					else {														//else, concat normally
						encryption += c;
					}
				}
				if(Character.isUpperCase(c)) {							
					c += N;														//cipher shift c
					if(c > 'Z'|| c < 'A') {										//if upper case c is not in the alphabet anymore
						encryption += (char)(originalStr.charAt(i) - (26-N));	//set encryption to current char minus (alphabet size minus cipher shift)
					}
					else {
						encryption += c;										//else, concat normally
					}
				}
			}
		}
		//----------------------END UPDATED LAB 2 CODE----------------------
		encrypted.setText(encryption);					//PRINT ENCODED TEXT INTO THE CIPHER TEXTFIELD BOX
	}
}

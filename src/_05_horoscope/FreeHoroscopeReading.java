package _05_horoscope;

import java.net.URI;

import javax.swing.JOptionPane;

public class FreeHoroscopeReading {
public static void main(String[] args) {
String ok =	JOptionPane.showInputDialog("Please type your Star Sign");
	if(ok.equals("Aquarius")) {
	playVideo("https://www.horoscopedates.com/daily-horoscope/aquarius/"); 
} else if(ok.equals("Pisces")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/pisces/");
} else if(ok.equals("Aries")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/aries/");
} else if(ok.equals("Taurus")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/taurus/");
} else if(ok.equals("Gemini")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/gemini/");
} else if(ok.equals("Cancer")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/cancer/");
} else if(ok.equals("Leo")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/leo/");
} else if(ok.equals("Virgo")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/virgo/");
} else if(ok.equals("Libra")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/libra/");
} else if(ok.equals("Scorpio")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/scorpio/");
} else if(ok.equals("Sagittarius")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/sagittarius/");
} else if(ok.equals("Capricorn")){
	playVideo("https://www.horoscopedates.com/daily-horoscope/capricorn/");
}else {
	JOptionPane.showMessageDialog(null, "That's not a Star Sign!:(");}
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
static void playVideo(String videoURL) {
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}}
package hu.uni.miskolc.iit.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Készítsen egy futtatható osztályt, amelyben létrehoz és tömbben tárol
		// beolvasott számú beolvasott(vagy random) adatú hanglemezt. Írja ki a
		// leghosszabb lemez adatait. Írja ki egy beolvasott nevű előadó lemezeit.
		Scanner scanner = new Scanner(System.in);
		Music[] songs = new Music[Integer.parseInt(scanner.nextLine())];
		for (int i = 0; i < songs.length; i++) {
			songs[i] = new Music("Adam" + i, "Csuhajja" + i * i * i, (666 * i / 12));
		}
		Music longestSong = songs[0];
		for (int i = 1; i < songs.length; i++) {
			if (longestSong.compareLength(songs[i]) == -1) {
				longestSong = songs[i];
			}
		}
		System.out.println("Leghosszabb zene" + longestSong);

		System.out.println("Adjon meg egy előadót");
		String artist = scanner.nextLine();
		for (Music music : songs) {
			if (music.artitsEquals(artist)) {
				System.out.println(music);
			}
		}
	}

}

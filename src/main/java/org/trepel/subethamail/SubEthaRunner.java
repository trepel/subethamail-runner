package org.trepel.subethamail;

import java.util.List;
import java.util.Scanner;

import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

public class SubEthaRunner {

	private static final int SMTP_PORT = 2566;
	private static final String SMTP_HOST = "localhost";

	public static void main(String[] args) {
		Wiser w = new Wiser();
		w.setHostname(SMTP_HOST);
		w.setPort(SMTP_PORT);

		w.start();

		System.out.println("The SubEtha SMTP mail service has started.");
		System.out.println("To stop it end read all messages, press any key.");
		Scanner sc = new Scanner(System.in);
		String key = sc.next();

		List<WiserMessage> msgs = w.getMessages();
		int counter = 0;
		for (WiserMessage msg : msgs) {
			System.out.println("\n");
			System.out.println("Message " + counter + "\n " + new String(msg.getData()));
			counter++;
		}
		w.stop();
	}
}

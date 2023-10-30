package Mails;

public class Main {

	public static void main(String[] args) {
		
		User john = new User("John", "MDP");
		
		User greg = new User("Greg", "123");
		
		Mail mail1 = new Mail("Hello greg! How are you?", "News", 
			greg.GetFullMail(), john.GetFullMail());
		Mail mail2 = new Mail("Hello john! I'm fine, thanks?!", "RE:News", 
			john.GetFullMail(), greg.GetFullMail());
		
		MailAdress johnMails = john.GetMailAdress();
		MailAdress gregMails = greg.GetMailAdress();
		
		johnMails.AddRecvMail(mail2);
		johnMails.AddSentMail(mail1);
		
		gregMails.AddRecvMail(mail1);
		gregMails.AddSentMail(mail2);
		
		johnMails.DisplayAllMails();
		System.out.println("------------------");
		gregMails.DisplayAllMails();
		System.out.println("------------------");
		
		Mail mail3 = new Mail("Greg are you sure ?", "RE:RE:News", 
			greg.GetFullMail(), john.GetFullMail());
		
		System.out.println("aaaaaaaaaaaaaaaaaa");
		gregMails.AddRecvMail(mail3);
		gregMails.DisplayRecvMail(gregMails.GetRecvMails().size()-1);
	}

}

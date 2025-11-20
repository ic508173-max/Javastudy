package team.sec01;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택> ");
            String select = scanner.nextLine();
            System.out.println("--------------");

            switch (select) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }

    
    // 계좌 생성
    
    private static void createAccount() {
        System.out.println("계좌생성");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        // 배열에 저장
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account(ano, owner, balance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                return;
            }
        }
    }

   
    // 계좌 목록 출력
    
    private static void accountList() {
        System.out.println("계좌목록");
        System.out.println("--------------");

        for (Account acc : accountArray) {
            if (acc != null) {
                System.out.println(acc.getAno() + "\t" + acc.getOwner() + "\t" + acc.getBalance());
            }
        }
    }

    
    // 예금
    
    private static void deposit() {
        System.out.println("예금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        account.deposit(money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    
    // 출금
   
    private static void withdraw() {
        System.out.println("출금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        if (account.withdraw(money)) {
            System.out.println("결과: 출금이 성공되었습니다.");
        } else {
            System.out.println("결과: 잔액이 부족합니다.");
        }
    }

   
    // 계좌 검색
    
    private static Account findAccount(String ano) {
        for (Account acc : accountArray) {
            if (acc != null && acc.getAno().equals(ano)) {
                return acc;
            }
        }
        return null;
    }



}

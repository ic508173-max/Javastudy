package finalProject;

import java.util.ArrayList;

public class AccountBook {
	private ArrayList<Transaction> transactions;

    public AccountBook() {
        transactions = new ArrayList<>();
    }

    // ===== 거래 추가 =====
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // ===== 거래 전체 출력 =====
    public void printAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("등록된 거래가 없습니다.");
            return;
        }

        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    // ===== 총 지출 합계 계산 =====
    public int getTotalAmount() {
        int sum = 0;
        for (Transaction t : transactions) {
            sum += t.getAmount();
        }
        return sum;
    }

    // ===== 특정 월의 평균 지출 (월별 평균 기능) =====
    // date 형식: YYYY-MM-DD 가정
    public double getMonthlyAverage(String yearMonth) {
        // yearMonth 예: "2025-12"
        int sum = 0;
        int count = 0;

        for (Transaction t : transactions) {
            if (t.getDate().startsWith(yearMonth)) {
                sum += t.getAmount();
                count++;
            }
        }

        if (count == 0) return 0;

        return (double) sum / count;
    }

    // ===== 카테고리별 총합 =====
    public int getCategoryTotal(Category category) {
        int sum = 0;
        for (Transaction t : transactions) {
            if (t.getCategory() == category) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

}

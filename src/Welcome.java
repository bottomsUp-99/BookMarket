import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = br.readLine();
        System.out.print("연락처를 입력하세요 : ");
        String userPhoneNum = br.readLine();

        for (int i = 0; i < 47; i++) {
            System.out.print("*");
        }
        System.out.println("\n\t\tWelcome to Shopping Mall");
        System.out.println("\t\tWelcome to Book Market!");
        for (int i = 0; i < 47; i++) {
            System.out.print("*");
        }
        System.out.println("\n 1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기\t\t\t8. 종료");
        for (int i = 0; i < 47; i++) {
            System.out.print("*");
        }
        System.out.print("\n메뉴 번호를 선택해주세요 ");
        int menuNum = Integer.parseInt(br.readLine());
        System.out.println(menuNum + "번을 선택했습니다");
    }
}

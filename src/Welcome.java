import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 이름을 입력하세요 : ");
        String memberName = br.readLine();
        System.out.print("연락처를 입력하세요 : ");
        String memberPhoneNum = br.readLine();

        boolean quit = false;
        while (!quit){

            for (int i = 0; i < 47; i++) {
                System.out.print("*");
            }

            String greetingLine = "Welcome to Shopping Mall";
            String tagLine = "Welcome to Book Market!";
            System.out.println("\n\t\t" + greetingLine);
            System.out.println("\t\t" + tagLine);

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
            if (menuNum < 1 || menuNum > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해주세요");
            } else {
                switch (menuNum) {
                    case 1:
                        System.out.println("현재 고객의 정보 : 이름 <" + memberName + "> 연락처 <" + memberPhoneNum + ">");
                        break;
                    case 2:
                        System.out.println("장바구니 상품 목록 보기");
                        break;
                    case 3:
                        System.out.println("장바구니 비우기");
                        break;
                    case 4:
                        System.out.println("장바구니에 항목 추가하기");
                        break;
                    case 5:
                        System.out.println("장바구니의 항목 수량 줄이기");
                        break;
                    case 6:
                        System.out.println("장바구니의 항목 삭제하기");
                        break;
                    case 7:
                        System.out.println("영수증 표시하기");
                        break;
                    case 8:
                        System.out.println("종료");
                        quit = true;
                        System.out.println("온라인 도서몰을 찾아주셔서 감사합니다. 다음에 다시 뵙겠습니다.");
                        break;
                }
            }
        }
    }
}
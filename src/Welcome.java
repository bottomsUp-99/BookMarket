import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 이름을 입력하세요 : ");
        String guestName = br.readLine();
        System.out.print("연락처를 입력하세요 : ");
        String guestPhoneNum = br.readLine();

        while (true){

            drawDividingLine();

            String greetingLine = "Welcome to Shopping Mall";
            String tagLine = "Welcome to Book Market!";
            System.out.println("\n\t\t" + greetingLine);
            System.out.println("\t\t" + tagLine);

            menuIntroduction();

            System.out.print("\n메뉴 번호를 선택해주세요 ");
            int menuNum = Integer.parseInt(br.readLine());
            System.out.println(menuNum + "번을 선택했습니다");
            if (menuNum < 1 || menuNum > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해주세요");
            } else {
                switch (menuNum) {
                    case 1:
                        menuGuestInfo(guestName, guestPhoneNum);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4:
                        menuCartAddItem();
                        break;
                    case 5:
                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        menuCartBill();
                        break;
                    case 8:
                        menuExit();
                        break;
                }
            }
        }
    }

    public static void menuIntroduction() {
        drawDividingLine();
        System.out.println("\n 1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기\t\t\t8. 종료");
        drawDividingLine();
    }

    public static void drawDividingLine(){
        for (int i = 0; i < 47; i++) {
            System.out.print("*");
        }
    }

    public static void menuGuestInfo(String name, String phoneNum){
        System.out.println("고객님의 정보 : [이름] -> " + name + " / [핸드폰 번호] -> " + phoneNum);
    }
    public static void menuCartItemList(){
        System.out.println("[장바구니 상품 목록 보기]");
    }
    public static void menuCartClear(){
        System.out.println("[장바구니 비우기]");
    }
    public static void menuCartAddItem(){
        System.out.println("[장바구니에 항목 추가하기]");
    }
    public static void menuCartRemoveItemCount(){
        System.out.println("[장바구니의 항목 수량 줄이기]");
    }
    public static void menuCartRemoveItem(){
        System.out.println("[장바구니의 항목 삭제하기]");
    }
    public static void menuCartBill(){
        System.out.println("[영수증 표시하기]");
    }
    public static void menuExit(){
        System.out.println("저희 쇼핑몰을 찾아주셔서 감사합니다.\n다음에 또 뵙겠습니다.\n[종료]");
        System.exit(0);
    }
}
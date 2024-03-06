// 친구 클래스
class Friend {
    String name;
    Company cmp; // 친구의 회사 참조변수

    public Friend(String n, Company c) {
        name = n;
        cmp = c;
    }

    public String getName() {
        return name;
    }

    public Company getCmp() {
        return cmp; // 친구의 회사 리턴
    }
}

// 회사
class Company {
    String cName; // 이름
    ContInfo cInfo; // null 인줄 알수 없음, 정보

    public Company(String cn, ContInfo ci) {
        cName = cn;
        cInfo = ci;
    }

    public String getCName() {
        return cName;
    }

    // 정보 리턴
    public ContInfo getContInfo() {
        return cInfo;
    }
}

// 정보
class ContInfo {
    String phone; // null 일 수 있음
    String adrs; // null 일 수 있음

    public ContInfo(String ph, String ad) {
        phone = ph;
        adrs = ad;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdrs() {
        return adrs;
    }
}

class NullPointerCaseStudy {
    // 매개변수 친구 Friend f
    public static void showCompAddr(Friend f) {
        String addr = null;

        // 친구가 Null이 아니면
        if (f != null) {
            // 친구의 회사 정보를 가져옴
            Company com = f.getCmp();
            // 회사 정보가 Null이 아니면
            if (com != null) {
                // 정보를 가져옴
                ContInfo info = com.getContInfo();
                // 정보가 null이 아니면
                if (info != null) {
                    // 주소를 가져옴
                    addr = info.getAdrs();
                }
            }
        }

        // addr이 null이 아니면 즉, 성공적으로 모든 정보들이 null 아니면 null이 아니다.
        if (addr != null) {
            // 주소 출력
            System.out.println(addr);
        }
        // 어느 정보 하나라도 없다면
        else {
            System.out.println("There's no address information");
        }

    }

    public static void main(String[] args) {
        // 핸드폰과, 주소입력
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
        // 회사 이름과, 정보(핸드폰, 주소) 입력
        Company cp = new Company("YaHo Co., Ltd.", ci);
        // 친구의 이름과, 친구의 회사 정보(정보(핸드폰, 주소)) 입력
        Friend frn = new Friend("Lee Su", cp);
        showCompAddr(frn); // 친구가 다니는 회사 주소 출력
    }
}
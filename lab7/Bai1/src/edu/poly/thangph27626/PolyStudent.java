package edu.poly.thangph27626;

public class PolyStudent {

    private String name;
    private CareerPoly career;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CareerPoly getCareer() {
        return career;
    }

    public void setCareer(CareerPoly career) {
        this.career = career;
    }

    public PolyStudent(String name, CareerPoly career) {
        this.name = name;
        this.career = career;
    }

    public PolyStudent() {
    }

    public void output() {
        System.out.printf("ten sinh vien la: %-30s", name);

        switch (this.career) {
            case UDPM:
                System.out.println("nganh: Cong nghe thong tin");
                break;
            case TKTW:
                System.out.println("nganh: thiet ke web");
                break;
            case LTDĐ:
                System.out.println("nganh: lap trinh di dong");
                break;
            case TKĐH:
                System.out.println("nganh: thiet ke do hoa");
                break;
            default:
                System.out.println("nganh: khong ton tai");
        }
    }
}

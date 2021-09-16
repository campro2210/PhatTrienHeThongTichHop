public class phanSo {
    int tuso;
    int mauso;
     public  phanSo(int x, int y){  // gan gia tri point
        this.tuso = x;
        this.mauso = y;
    }
  
    void showPhanSo(){ // in toa do
        System.out.println("Phan so la: (" + tuso +"/" + mauso +")");

    }
    void swapPhanSo(){
        int temp;
        temp = mauso;
        mauso = tuso;
        tuso = temp;
        System.out.println("Phan so sau khi swap la: (" + tuso +"/" + mauso +")");
    }
    void valuePhanSo(){
        float a = (float)tuso/mauso;
        System.out.println("gia tri thuc cua phanso:" + a);
    }

    public int getTu() {
        return tuso;
    }
 
    public void setTu(int tu) {
        this.tuso = tu;
    }
 
    public int getMau() {
        return mauso;
    }
 
    public void setMau(int mau) {
        this.mauso = mau;
    }
 
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void congPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoTong = new phanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuso + "/" + phanSoTong.mauso);
    }
      
    public void truPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoHieu = new phanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuso + "/" + phanSoHieu.mauso);
    }
     
    public void nhanPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoTich = new phanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tuso + "/" + phanSoTich.mauso);
    }
     
    public void chiaPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        phanSo phanSoThuong = new phanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tuso + "/" + phanSoThuong.mauso);
    }

    
    public static void main(String[] args) {
        phanSo  a= new phanSo(9, 5);
        phanSo  b= new phanSo(4, 5);
        a.showPhanSo();
        b.showPhanSo();
        a.valuePhanSo();
        b.valuePhanSo();
        a.swapPhanSo();
        b.swapPhanSo();
        a.congPhanSo(b);
        b.truPhanSo(a);
        a.nhanPhanSo(b);
        a.chiaPhanSo(b);

    }
}

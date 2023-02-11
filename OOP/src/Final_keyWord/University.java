package Final_keyWord;

public class University {

    final String university_name = "AIUB";
    final int lab_fee; // blank final variable ;; constructor need to be use for value initializion
    // lab_fee = 3000;   which is not possible ;;

    /*   public University(int lab_fee) {
        this.lab_fee = lab_fee;
    }  */
    public University() {
        lab_fee = 3000;
    }

    static final int ajaira_fee;  // static blank final variable ;; static block need to use for value initializion

    static {
        ajaira_fee = 4000;
    }
  void display(){
      System.out.println("University Name : "+ university_name );
      System.out.println("Lab Fee : "+lab_fee);
      System.out.println("Ajairaa Fee : "+ajaira_fee);
  }
}

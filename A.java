import java.util.*;

public class A{
  public int x;
  public A(){ /// გვესალმება და რთავს მეთოდებს
    System.out.println("hello");
    this.method1A();
    this.method2A();
    this.method3A();
  }

  public void method1A(){ /// კლავიატურიდან იქსის მნიშვნელობა
    Scanner input = new Scanner(System.in);
    this.x = input.nextInt();
  }

  public int method2A(){ /// იქსის და 12ს ჯამი
    return this.x + 12;
  }

  public String method3A(){ /// ლუწია თუ არა შეტანილი რიცხვი
    if(this.x % 2 == 0){
      return "ლუწი";
    }
    else{
      return "კენტი";
    }
  }

}
import java.util.*;

public class C{
  public int a,b,c;

  public C(){ /// რთავს მეთოდებს
    this.method1();
    this.method2();
    this.method3();
    this.method4();
    this.method5();
    this.method6();
  }

  public void method1(){ /// ცვლადების მნიშვნელობა კლავიატურიდან
    Scanner input = new Scanner(System.in);

    System.out.println("A: ");
    this.a = input.nextInt();

    System.out.println("B: ");
    this.b = input.nextInt();

    System.out.println("C: ");
    this.c = input.nextInt();
  }

  public int method2(){ /// პირველი ცვლადის ბოლო ციფრი
    return(this.a%10);
  }

  public int method3(){ /// მეორე ცვლადის პირველი ციფრი
    int b2 = this.b;
    while (b2 >= 10)  
      b2 /= 10; 
    return b2; 
  }

  public int method4(){ /// მესამე ცვლადის ციფრების ჯამი
    int c2 = this.c;
    int sum = 0;
    while (c2 > 0) {
      sum = sum + c2 % 10;
      c2 = c2 / 10;
    }
    return sum; 
  }

  public int method5(){ /// მეორე და მესამე მეთოდების შედეგების ნამრავლი
    return this.method2() * this.method3();
  }

  public int method6(){ /// მესამე და მეხუტე მეთოდების ჯამი
    return this.method3() + this.method5();
  }
}
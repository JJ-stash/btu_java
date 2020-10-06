import java.util.*;

public class B extends A{ /// კლასი ბ არის ა_ს შვილობილი
  public int y;
  public B(){ /// რთავს შემდეგ მეთოდებს
    this.method1B();
    this.method2B();
  }

  public void method1B(){ /// იგრეკის მნიშვნელობა კლავიატურიდან
    Scanner input = new Scanner(System.in);
    this.y = input.nextInt();
  }

  public int method2B(){ /// იგრეკისა და იქსის ჯამი
    return this.x + this.y;
  }
}
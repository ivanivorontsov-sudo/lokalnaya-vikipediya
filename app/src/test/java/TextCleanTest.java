import ru.vorontsov.wiki.TextClean;
public class TextCleanTest {
  static int fail=0;
  static void eq(String in,String exp){String g=TextClean.line(in);if(!g.equals(exp)){fail++;System.out.println("FAIL: «"+in+"» -> «"+g+"» ждали «"+exp+"»");}else System.out.println("ok: "+g);}
  public static void main(String[] a){
    eq("Сердце (,) — полый фиброзно-мышечный орган","Сердце — полый фиброзно-мышечный орган");
    eq("Москва́ (; ) — столица России","Москва́ — столица России");
    eq("Пётр I ((, ;)) — царь","Пётр I — царь");
    eq("Луна (лат. Luna, ) — спутник","Луна (лат. Luna) — спутник");
    eq("Вода (, H2O) — вещество","Вода (H2O) — вещество");
    eq("Гёте (нем. ; ) — поэт","Гёте — поэт");
    eq("Река ( — ) течёт","Река течёт");
    eq("Город [ , ] стоит , на реке .","Город стоит, на реке.");
    eq("Рим (лат. Roma; итал. Roma) — столица","Рим (лат. Roma; итал. Roma) — столица");
    eq("Число (1) и f(x)","Число (1) и f(x)");
    eq("Атом (от греч. ) — частица","Атом — частица");
    eq("Сердце ( ,  ,) —  полый","Сердце — полый");
    if(!TextClean.text("А (,) б\n\nВ ( ) г").equals("А б\n\nВ г")){fail++;System.out.println("FAIL text");}
    System.out.println(fail==0?"ALL PASSED":fail+" FAILED"); System.exit(fail==0?0:1);
  }
}

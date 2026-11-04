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
    eq("Река ( — ) течёт","Река течёт");
    eq("Город [ , ] стоит , на реке .","Город стоит, на реке.");
    eq("Рим (лат. Roma; итал. Roma) — столица","Рим (лат. Roma; итал. Roma) — столица");
    eq("Число (1) и f(x)","Число (1) и f(x)");
    eq("Сердце ( ,  ,) —  полый","Сердце — полый");
    eq("Незакрытая ( скобка, ок","Незакрытая ( скобка, ок");
    eq("лишняя ) скобка","лишняя ) скобка");
    eq("Ньютон (,, Оксфорд, Англия —, Шалю, Франция) — физик","Ньютон (Оксфорд, Англия, Шалю, Франция) — физик");
    eq("Слово () и (;) и (,) тут","Слово и и тут");
    eq("Годы 1941—1945, война","Годы 1941—1945, война");
    eq("А — б, в: г","А — б, в: г");
    eq("x ;, y","x; y");
    if(TextClean.text(null)!=null){fail++;System.out.println("FAIL null");}
    if(!TextClean.text("А (,) б\n\nВ ( ) г").equals("А б\n\nВ г")){fail++;System.out.println("FAIL text");}
    StringBuilder big=new StringBuilder(); for(int i=0;i<20000;i++) big.append("Сердце (,) — орган ( ; ) x. ");
    big.append("("); for(int i=0;i<500000;i++) big.append(' '); // худший случай для регулярок
    long t0=System.nanoTime(); String r=TextClean.text(big.toString()); long ms=(System.nanoTime()-t0)/1000000;
    System.out.println("1MB+ ("+big.length()+" симв) за "+ms+" мс"); if(ms>2000||r.contains("(,)")){fail++;System.out.println("FAIL perf");}
    System.out.println(fail==0?"ALL PASSED":fail+" FAILED"); System.exit(fail==0?0:1);
  }
}

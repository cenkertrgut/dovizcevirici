package p004io.kodular.cenkertrgut.dovizcevirici;

import androidx.fragment.app.FragmentTransaction;
import com.Sumit1334.CurrencyConverter.C1287CurrencyConverter;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Spinner;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C1171runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C1192lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.jose4j.jws.AlgorithmIdentifiers;

/* renamed from: io.kodular.cenkertrgut.dovizcevirici.Cevirici */
/* compiled from: Cevirici.yail */
public class Cevirici extends Form implements Runnable {
    public static Cevirici Cevirici;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10 = IntNum.make(3);
    static final FString Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final IntNum Lit103 = IntNum.make(16);
    static final IntNum Lit104 = IntNum.make(-1030);
    static final FString Lit105;
    static final PairWithPosition Lit106 = PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 696478), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 696473);
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final PairWithPosition Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final FString Lit115;
    static final IntNum Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final IntNum Lit120;
    static final IntNum Lit121 = IntNum.make(-1030);
    static final FString Lit122;
    static final PairWithPosition Lit123;
    static final SimpleSymbol Lit124;
    static final FString Lit125;
    static final FString Lit126;
    static final SimpleSymbol Lit127;
    static final SimpleSymbol Lit128;
    static final SimpleSymbol Lit129;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130;
    static final SimpleSymbol Lit131;
    static final SimpleSymbol Lit132;
    static final SimpleSymbol Lit133;
    static final SimpleSymbol Lit134;
    static final SimpleSymbol Lit135;
    static final SimpleSymbol Lit136;
    static final SimpleSymbol Lit137;
    static final SimpleSymbol Lit138;
    static final SimpleSymbol Lit139;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit140;
    static final SimpleSymbol Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final SimpleSymbol Lit144;
    static final IntNum Lit15;
    static final SimpleSymbol Lit16;
    static final IntNum Lit17;
    static final SimpleSymbol Lit18;
    static final IntNum Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final IntNum Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 110670);
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final FString Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final IntNum Lit34 = IntNum.make(2);
    static final SimpleSymbol Lit35;
    static final IntNum Lit36 = IntNum.make(100);
    static final SimpleSymbol Lit37;
    static final IntNum Lit38 = IntNum.make(-2);
    static final FString Lit39;
    static final PairWithPosition Lit4 = PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33121), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33117), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33113), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33109), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33105), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33101), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33097), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33093), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33089), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33085), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33081), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33077), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33073), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33069), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33065), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33061), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33057), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33053), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33049), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33044);
    static final FString Lit40;
    static final SimpleSymbol Lit41;
    static final IntNum Lit42;
    static final SimpleSymbol Lit43;
    static final SimpleSymbol Lit44;
    static final SimpleSymbol Lit45;
    static final IntNum Lit46 = IntNum.make(20);
    static final SimpleSymbol Lit47;
    static final IntNum Lit48;
    static final SimpleSymbol Lit49;
    static final PairWithPosition Lit5 = PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, PairWithPosition.make(Lit144, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33121), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33117), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33113), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33109), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33105), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33101), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33097), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33093), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33089), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33085), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33081), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33077), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33073), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33069), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33065), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33061), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33057), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33053), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33049), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 33044);
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final FString Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final SimpleSymbol Lit56;
    static final SimpleSymbol Lit57;
    static final SimpleSymbol Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final SimpleSymbol Lit62;
    static final IntNum Lit63;
    static final SimpleSymbol Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final IntNum Lit7;
    static final SimpleSymbol Lit70;
    static final FString Lit71;
    static final SimpleSymbol Lit72;
    static final FString Lit73;
    static final FString Lit74;
    static final SimpleSymbol Lit75;
    static final IntNum Lit76;
    static final IntNum Lit77;
    static final IntNum Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final IntNum Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final FString Lit86;
    static final SimpleSymbol Lit87;
    static final IntNum Lit88 = IntNum.make(80);
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final SimpleSymbol Lit91;
    static final IntNum Lit92;
    static final SimpleSymbol Lit93;
    static final IntNum Lit94;
    static final SimpleSymbol Lit95;
    static final IntNum Lit96 = IntNum.make(5);
    static final IntNum Lit97;
    static final IntNum Lit98 = IntNum.make(-1075);
    static final FString Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Label Answer_lable;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public final ModuleMethod Cevirici$BackPressed;
    public C1287CurrencyConverter CurrencyConverter1;
    public final ModuleMethod CurrencyConverter1$Got;
    public TextBox From_Currency_Text_Box1;
    public final ModuleMethod From_Currency_Text_Box1$GotFocus;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement1_copy;
    public TextBox Label1;
    public Spinner Spinner1;
    public final ModuleMethod Spinner1$AfterSelecting;
    public Spinner Spinner2;
    public final ModuleMethod Spinner2$AfterSelecting;
    public TextBox To_currency_Text_Box;
    public final ModuleMethod To_currency_Text_Box$GotFocus;
    public HorizontalArrangement To_currency_Text_Box_copy;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol;
        SimpleSymbol simpleSymbol2;
        SimpleSymbol simpleSymbol3;
        SimpleSymbol simpleSymbol4;
        SimpleSymbol simpleSymbol5;
        SimpleSymbol simpleSymbol6;
        SimpleSymbol simpleSymbol7;
        SimpleSymbol simpleSymbol8;
        SimpleSymbol simpleSymbol9;
        SimpleSymbol simpleSymbol10;
        SimpleSymbol simpleSymbol11;
        SimpleSymbol simpleSymbol12;
        SimpleSymbol simpleSymbol13;
        SimpleSymbol simpleSymbol14;
        SimpleSymbol simpleSymbol15;
        SimpleSymbol simpleSymbol16;
        SimpleSymbol simpleSymbol17;
        SimpleSymbol simpleSymbol18;
        FString fString;
        FString fString2;
        SimpleSymbol simpleSymbol19;
        SimpleSymbol simpleSymbol20;
        FString fString3;
        SimpleSymbol simpleSymbol21;
        FString fString4;
        FString fString5;
        FString fString6;
        SimpleSymbol simpleSymbol22;
        SimpleSymbol simpleSymbol23;
        SimpleSymbol simpleSymbol24;
        SimpleSymbol simpleSymbol25;
        SimpleSymbol simpleSymbol26;
        SimpleSymbol simpleSymbol27;
        SimpleSymbol simpleSymbol28;
        SimpleSymbol simpleSymbol29;
        FString fString7;
        SimpleSymbol simpleSymbol30;
        FString fString8;
        FString fString9;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        SimpleSymbol simpleSymbol33;
        FString fString10;
        FString fString11;
        SimpleSymbol simpleSymbol34;
        FString fString12;
        SimpleSymbol simpleSymbol35;
        FString fString13;
        FString fString14;
        SimpleSymbol simpleSymbol36;
        SimpleSymbol simpleSymbol37;
        FString fString15;
        SimpleSymbol simpleSymbol38;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol39;
        FString fString18;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        SimpleSymbol simpleSymbol43;
        FString fString19;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        FString fString20;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        SimpleSymbol simpleSymbol52;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        FString fString21;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        SimpleSymbol simpleSymbol61;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        SimpleSymbol simpleSymbol64;
        SimpleSymbol simpleSymbol65;
        FString fString24;
        SimpleSymbol simpleSymbol66;
        SimpleSymbol simpleSymbol67;
        SimpleSymbol simpleSymbol68;
        SimpleSymbol simpleSymbol69;
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        SimpleSymbol simpleSymbol72;
        SimpleSymbol simpleSymbol73;
        SimpleSymbol simpleSymbol74;
        SimpleSymbol simpleSymbol75;
        SimpleSymbol simpleSymbol76;
        SimpleSymbol simpleSymbol77;
        SimpleSymbol simpleSymbol78;
        SimpleSymbol simpleSymbol79;
        SimpleSymbol simpleSymbol80;
        SimpleSymbol simpleSymbol81;
        SimpleSymbol simpleSymbol82;
        SimpleSymbol simpleSymbol83;
        SimpleSymbol simpleSymbol84;
        SimpleSymbol simpleSymbol85;
        new SimpleSymbol("any");
        Lit144 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("lookup-handler");
        Lit143 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit142 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit141 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("send-error");
        Lit140 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit139 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit138 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-components");
        Lit137 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-events");
        Lit136 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit135 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit134 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit133 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit132 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("android-log-form");
        Lit131 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit130 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("Got");
        Lit129 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol("CurrencyConverter1$Got");
        Lit128 = (SimpleSymbol) simpleSymbol17.readResolve();
        new SimpleSymbol("$amount");
        Lit127 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.Sumit1334.CurrencyConverter.CurrencyConverter");
        Lit126 = fString;
        new FString("com.Sumit1334.CurrencyConverter.CurrencyConverter");
        Lit125 = fString2;
        new SimpleSymbol("Button2$Click");
        Lit124 = (SimpleSymbol) simpleSymbol19.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol86 = (SimpleSymbol) simpleSymbol20.readResolve();
        Lit12 = simpleSymbol86;
        Lit123 = PairWithPosition.make(simpleSymbol86, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 802894);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit122 = fString3;
        int[] iArr = new int[2];
        iArr[0] = -16738680;
        Lit120 = IntNum.make(iArr);
        new SimpleSymbol("Button2");
        Lit119 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit118 = fString4;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit117 = fString5;
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit116 = IntNum.make(iArr2);
        new FString("com.google.appinventor.components.runtime.Label");
        Lit115 = fString6;
        new SimpleSymbol("Click");
        Lit114 = (SimpleSymbol) simpleSymbol22.readResolve();
        new SimpleSymbol("Button1$Click");
        Lit113 = (SimpleSymbol) simpleSymbol23.readResolve();
        new SimpleSymbol("number");
        SimpleSymbol simpleSymbol87 = (SimpleSymbol) simpleSymbol24.readResolve();
        Lit8 = simpleSymbol87;
        Lit112 = PairWithPosition.make(simpleSymbol87, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Cevirici.yail", 696914);
        new SimpleSymbol("Get");
        Lit111 = (SimpleSymbol) simpleSymbol25.readResolve();
        new SimpleSymbol("To");
        Lit110 = (SimpleSymbol) simpleSymbol26.readResolve();
        new SimpleSymbol("From");
        Lit109 = (SimpleSymbol) simpleSymbol27.readResolve();
        new SimpleSymbol("CurrencyConverter1");
        Lit108 = (SimpleSymbol) simpleSymbol28.readResolve();
        new SimpleSymbol("Answer_lable");
        Lit107 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit105 = fString7;
        int[] iArr3 = new int[2];
        iArr3[0] = -16738680;
        Lit102 = IntNum.make(iArr3);
        new SimpleSymbol("Button1");
        Lit101 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = fString8;
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit99 = fString9;
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit97 = IntNum.make(iArr4);
        new SimpleSymbol("InputType");
        Lit95 = (SimpleSymbol) simpleSymbol31.readResolve();
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit94 = IntNum.make(iArr5);
        new SimpleSymbol("Hint");
        Lit93 = (SimpleSymbol) simpleSymbol32.readResolve();
        int[] iArr6 = new int[2];
        iArr6[0] = -13816256;
        Lit92 = IntNum.make(iArr6);
        new SimpleSymbol("Label1");
        Lit91 = (SimpleSymbol) simpleSymbol33.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit90 = fString10;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit89 = fString11;
        new SimpleSymbol("To_currency_Text_Box_copy");
        Lit87 = (SimpleSymbol) simpleSymbol34.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit86 = fString12;
        new SimpleSymbol("Spinner2$AfterSelecting");
        Lit85 = (SimpleSymbol) simpleSymbol35.readResolve();
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit84 = fString13;
        int[] iArr7 = new int[2];
        iArr7[0] = -6543440;
        Lit83 = IntNum.make(iArr7);
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit82 = fString14;
        new SimpleSymbol("To_currency_Text_Box$GotFocus");
        Lit81 = (SimpleSymbol) simpleSymbol36.readResolve();
        new SimpleSymbol("Spinner2");
        Lit80 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit79 = fString15;
        int[] iArr8 = new int[2];
        iArr8[0] = -1;
        Lit78 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit77 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -13816256;
        Lit76 = IntNum.make(iArr10);
        new SimpleSymbol("To_currency_Text_Box");
        Lit75 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit74 = fString16;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit73 = fString17;
        new SimpleSymbol("Horizontal_Arrangement1_copy");
        Lit72 = (SimpleSymbol) simpleSymbol39.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit71 = fString18;
        new SimpleSymbol("AfterSelecting");
        Lit70 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("Spinner1$AfterSelecting");
        Lit69 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("$selection");
        Lit68 = (SimpleSymbol) simpleSymbol42.readResolve();
        new SimpleSymbol("Text");
        Lit67 = (SimpleSymbol) simpleSymbol43.readResolve();
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit66 = fString19;
        new SimpleSymbol("TextSize");
        Lit65 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("SpinnerTextSize");
        Lit64 = (SimpleSymbol) simpleSymbol45.readResolve();
        int[] iArr11 = new int[2];
        iArr11[0] = -6543440;
        Lit63 = IntNum.make(iArr11);
        new SimpleSymbol("ItemBackgroundColor");
        Lit62 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("ElementsFromString");
        Lit61 = (SimpleSymbol) simpleSymbol47.readResolve();
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit60 = fString20;
        new SimpleSymbol("GotFocus");
        Lit59 = (SimpleSymbol) simpleSymbol48.readResolve();
        new SimpleSymbol("From_Currency_Text_Box1$GotFocus");
        Lit58 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("HideKeyboard");
        Lit57 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("DisplayDropdown");
        Lit56 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("list");
        Lit55 = (SimpleSymbol) simpleSymbol52.readResolve();
        new SimpleSymbol("Elements");
        Lit54 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("Spinner1");
        Lit53 = (SimpleSymbol) simpleSymbol54.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit52 = fString21;
        int[] iArr12 = new int[2];
        iArr12[0] = -1;
        Lit51 = IntNum.make(iArr12);
        new SimpleSymbol("TextColor");
        Lit50 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("ReadOnly");
        Lit49 = (SimpleSymbol) simpleSymbol56.readResolve();
        int[] iArr13 = new int[2];
        iArr13[0] = -1;
        Lit48 = IntNum.make(iArr13);
        new SimpleSymbol("HintColor");
        Lit47 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("FontSize");
        Lit45 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("FontItalic");
        Lit44 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("FontBold");
        Lit43 = (SimpleSymbol) simpleSymbol60.readResolve();
        int[] iArr14 = new int[2];
        iArr14[0] = -13816256;
        Lit42 = IntNum.make(iArr14);
        new SimpleSymbol("From_Currency_Text_Box1");
        Lit41 = (SimpleSymbol) simpleSymbol61.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit40 = fString22;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit39 = fString23;
        new SimpleSymbol("Width");
        Lit37 = (SimpleSymbol) simpleSymbol62.readResolve();
        new SimpleSymbol("Height");
        Lit35 = (SimpleSymbol) simpleSymbol63.readResolve();
        new SimpleSymbol("AlignVertical");
        Lit33 = (SimpleSymbol) simpleSymbol64.readResolve();
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit32 = (SimpleSymbol) simpleSymbol65.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit31 = fString24;
        new SimpleSymbol("BackPressed");
        Lit30 = (SimpleSymbol) simpleSymbol66.readResolve();
        new SimpleSymbol("Cevirici$BackPressed");
        Lit29 = (SimpleSymbol) simpleSymbol67.readResolve();
        new SimpleSymbol("Title");
        Lit27 = (SimpleSymbol) simpleSymbol68.readResolve();
        new SimpleSymbol("SplashIcon");
        Lit26 = (SimpleSymbol) simpleSymbol69.readResolve();
        new SimpleSymbol("SplashEnabled");
        Lit25 = (SimpleSymbol) simpleSymbol70.readResolve();
        new SimpleSymbol("boolean");
        Lit24 = (SimpleSymbol) simpleSymbol71.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit23 = (SimpleSymbol) simpleSymbol72.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit22 = (SimpleSymbol) simpleSymbol73.readResolve();
        int[] iArr15 = new int[2];
        iArr15[0] = -14474700;
        Lit21 = IntNum.make(iArr15);
        new SimpleSymbol("PrimaryColorDark");
        Lit20 = (SimpleSymbol) simpleSymbol74.readResolve();
        int[] iArr16 = new int[2];
        iArr16[0] = -14474700;
        Lit19 = IntNum.make(iArr16);
        new SimpleSymbol("PrimaryColor");
        Lit18 = (SimpleSymbol) simpleSymbol75.readResolve();
        int[] iArr17 = new int[2];
        iArr17[0] = -14474700;
        Lit17 = IntNum.make(iArr17);
        new SimpleSymbol("NavigationBarColor");
        Lit16 = (SimpleSymbol) simpleSymbol76.readResolve();
        int[] iArr18 = new int[2];
        iArr18[0] = -14474700;
        Lit15 = IntNum.make(iArr18);
        new SimpleSymbol("BackgroundColor");
        Lit14 = (SimpleSymbol) simpleSymbol77.readResolve();
        new SimpleSymbol("AppName");
        Lit13 = (SimpleSymbol) simpleSymbol78.readResolve();
        new SimpleSymbol("AppId");
        Lit11 = (SimpleSymbol) simpleSymbol79.readResolve();
        new SimpleSymbol("AlignHorizontal");
        Lit9 = (SimpleSymbol) simpleSymbol80.readResolve();
        int[] iArr19 = new int[2];
        iArr19[0] = -14474700;
        Lit7 = IntNum.make(iArr19);
        new SimpleSymbol("AccentColor");
        Lit6 = (SimpleSymbol) simpleSymbol81.readResolve();
        new SimpleSymbol("g$To_Currency");
        Lit3 = (SimpleSymbol) simpleSymbol82.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol83.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol84.readResolve();
        new SimpleSymbol("Cevirici");
        Lit0 = (SimpleSymbol) simpleSymbol85.readResolve();
    }

    public Cevirici() {
        ModuleMethod moduleMethod;
        frame frame2;
        ModuleMethod moduleMethod2;
        ModuleMethod moduleMethod3;
        ModuleMethod moduleMethod4;
        ModuleMethod moduleMethod5;
        ModuleMethod moduleMethod6;
        ModuleMethod moduleMethod7;
        ModuleMethod moduleMethod8;
        ModuleMethod moduleMethod9;
        ModuleMethod moduleMethod10;
        ModuleMethod moduleMethod11;
        ModuleMethod moduleMethod12;
        ModuleMethod moduleMethod13;
        ModuleMethod moduleMethod14;
        ModuleMethod moduleMethod15;
        ModuleMethod moduleMethod16;
        ModuleMethod moduleMethod17;
        ModuleMethod moduleMethod18;
        ModuleMethod moduleMethod19;
        ModuleMethod moduleMethod20;
        ModuleMethod moduleMethod21;
        ModuleMethod moduleMethod22;
        ModuleMethod moduleMethod23;
        ModuleMethod moduleMethod24;
        ModuleMethod moduleMethod25;
        ModuleMethod moduleMethod26;
        ModuleMethod moduleMethod27;
        ModuleMethod moduleMethod28;
        ModuleMethod moduleMethod29;
        ModuleMethod moduleMethod30;
        ModuleMethod moduleMethod31;
        ModuleMethod moduleMethod32;
        ModuleMethod moduleMethod33;
        ModuleMethod moduleMethod34;
        ModuleMethod moduleMethod35;
        ModuleMethod moduleMethod36;
        ModuleMethod moduleMethod37;
        ModuleMethod moduleMethod38;
        ModuleMethod moduleMethod39;
        ModuleMethod moduleMethod40;
        ModuleMethod moduleMethod41;
        ModuleMethod moduleMethod42;
        ModuleMethod moduleMethod43;
        ModuleMethod moduleMethod44;
        ModuleMethod moduleMethod45;
        ModuleMethod moduleMethod46;
        ModuleMethod moduleMethod47;
        ModuleMethod moduleMethod48;
        ModuleMethod moduleMethod49;
        ModuleMethod moduleMethod50;
        ModuleMethod moduleMethod51;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod52 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit130, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod52;
        new ModuleMethod(frame4, 2, Lit131, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit132, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit133, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit134, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit135, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit136, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit137, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit138, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit139, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit140, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit141, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit142, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit143, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod53 = moduleMethod16;
        moduleMethod53.setProperty("source-location", "/tmp/runtime2716208737894551890.scm:615");
        lambda$Fn1 = moduleMethod53;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, (Object) null, 0);
        lambda$Fn3 = moduleMethod19;
        new ModuleMethod(frame4, 21, Lit29, 0);
        this.Cevirici$BackPressed = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn4 = moduleMethod21;
        new ModuleMethod(frame4, 23, (Object) null, 0);
        lambda$Fn5 = moduleMethod22;
        new ModuleMethod(frame4, 24, (Object) null, 0);
        lambda$Fn6 = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn7 = moduleMethod24;
        new ModuleMethod(frame4, 26, Lit58, 0);
        this.From_Currency_Text_Box1$GotFocus = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn8 = moduleMethod26;
        new ModuleMethod(frame4, 28, (Object) null, 0);
        lambda$Fn9 = moduleMethod27;
        new ModuleMethod(frame4, 29, Lit69, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Spinner1$AfterSelecting = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn10 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn11 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn12 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn13 = moduleMethod32;
        new ModuleMethod(frame4, 34, Lit81, 0);
        this.To_currency_Text_Box$GotFocus = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn14 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn15 = moduleMethod35;
        new ModuleMethod(frame4, 37, Lit85, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Spinner2$AfterSelecting = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn16 = moduleMethod37;
        new ModuleMethod(frame4, 39, (Object) null, 0);
        lambda$Fn17 = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn18 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn19 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn20 = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn21 = moduleMethod42;
        new ModuleMethod(frame4, 44, Lit113, 0);
        this.Button1$Click = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn22 = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn23 = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn24 = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn25 = moduleMethod47;
        new ModuleMethod(frame4, 49, Lit124, 0);
        this.Button2$Click = moduleMethod48;
        new ModuleMethod(frame4, 50, (Object) null, 0);
        lambda$Fn26 = moduleMethod49;
        new ModuleMethod(frame4, 51, (Object) null, 0);
        lambda$Fn27 = moduleMethod50;
        new ModuleMethod(frame4, 52, Lit128, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.CurrencyConverter1$Got = moduleMethod51;
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Throwable th;
        String obj;
        Throwable th2;
        Object obj2;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        Object obj3 = find;
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            Object[] objArr = new Object[2];
            objArr[0] = misc.symbol$To$String(Lit0);
            Object[] objArr2 = objArr;
            objArr2[1] = "-global-vars";
            FString stringAppend = strings.stringAppend(objArr2);
            FString fString = stringAppend;
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = fString.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Cevirici = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            Object obj4 = find2;
            try {
                ((Runnable) find2).run();
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    SimpleSymbol simpleSymbol = Lit3;
                    ModuleMethod moduleMethod = C1171runtime.make$Mnyail$Mnlist;
                    Pair list1 = LList.list1("BGN CHF CZK DKK EUR GBP HRK RUB UAH ILS MAD ZAR,USD,INR,JPY,MYR,PKR,SGD,LKR,BTC");
                    Pair chain1 = LList.chain1(LList.chain1(LList.chain1(LList.chain4(LList.chain4(LList.chain4(LList.chain4(list1, "CHF", "CZK ", "DKK", "EUR"), "GBP", "HRK", "RUB", "UAH"), "ILS", "MAD", "ZAR", "USD"), "INR", "JPY", "MYR", "PKR"), "SGD"), "LKR"), "BTC");
                    Values.writeValues(C1171runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, C1171runtime.callYailPrimitive(moduleMethod, list1, Lit4, "make a list")), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
                    Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit8);
                    Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "6745161059008512", Lit12);
                    Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "dovizcevirici", Lit12);
                    Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit8);
                    Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit8);
                    Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit8);
                    Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Lit21, Lit8);
                    Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit22, AlgorithmIdentifiers.NONE, Lit12);
                    Object andCoerceProperty$Ex10 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit24);
                    Object andCoerceProperty$Ex11 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Boolean.FALSE, Lit24);
                    Object andCoerceProperty$Ex12 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "None", Lit12);
                    Values.writeValues(C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "Çevirici", Lit12), $result);
                } else {
                    new Promise(lambda$Fn3);
                    addToFormDoAfterCreation(obj2);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment = C1171runtime.addToCurrentFormEnvironment(Lit29, this.Cevirici$BackPressed);
                } else {
                    addToFormEnvironment(Lit29, this.Cevirici$BackPressed);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Cevirici", "BackPressed");
                } else {
                    addToEvents(Lit0, Lit30);
                }
                this.Horizontal_Arrangement1 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit31, Lit32, lambda$Fn4), $result);
                } else {
                    addToComponents(Lit0, Lit39, Lit32, lambda$Fn5);
                }
                this.From_Currency_Text_Box1 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit32, Lit40, Lit41, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit32, Lit52, Lit41, lambda$Fn7);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment2 = C1171runtime.addToCurrentFormEnvironment(Lit58, this.From_Currency_Text_Box1$GotFocus);
                } else {
                    addToFormEnvironment(Lit58, this.From_Currency_Text_Box1$GotFocus);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "From_Currency_Text_Box1", "GotFocus");
                } else {
                    addToEvents(Lit41, Lit59);
                }
                this.Spinner1 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit32, Lit60, Lit53, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit32, Lit66, Lit53, lambda$Fn9);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment3 = C1171runtime.addToCurrentFormEnvironment(Lit69, this.Spinner1$AfterSelecting);
                } else {
                    addToFormEnvironment(Lit69, this.Spinner1$AfterSelecting);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Spinner1", "AfterSelecting");
                } else {
                    addToEvents(Lit53, Lit70);
                }
                this.Horizontal_Arrangement1_copy = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit71, Lit72, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit0, Lit73, Lit72, lambda$Fn11);
                }
                this.To_currency_Text_Box = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit72, Lit74, Lit75, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit72, Lit79, Lit75, lambda$Fn13);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment4 = C1171runtime.addToCurrentFormEnvironment(Lit81, this.To_currency_Text_Box$GotFocus);
                } else {
                    addToFormEnvironment(Lit81, this.To_currency_Text_Box$GotFocus);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "To_currency_Text_Box", "GotFocus");
                } else {
                    addToEvents(Lit75, Lit59);
                }
                this.Spinner2 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit72, Lit82, Lit80, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit72, Lit84, Lit80, lambda$Fn15);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment5 = C1171runtime.addToCurrentFormEnvironment(Lit85, this.Spinner2$AfterSelecting);
                } else {
                    addToFormEnvironment(Lit85, this.Spinner2$AfterSelecting);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Spinner2", "AfterSelecting");
                } else {
                    addToEvents(Lit80, Lit70);
                }
                this.To_currency_Text_Box_copy = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit0, Lit89, Lit87, lambda$Fn17);
                }
                this.Label1 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit87, Lit90, Lit91, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit87, Lit99, Lit91, lambda$Fn19);
                }
                this.Button1 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit100, Lit101, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit0, Lit105, Lit101, lambda$Fn21);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment6 = C1171runtime.addToCurrentFormEnvironment(Lit113, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit113, this.Button1$Click);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit101, Lit114);
                }
                this.Answer_lable = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit115, Lit107, lambda$Fn22), $result);
                } else {
                    addToComponents(Lit0, Lit117, Lit107, lambda$Fn23);
                }
                this.Button2 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit118, Lit119, lambda$Fn24), $result);
                } else {
                    addToComponents(Lit0, Lit122, Lit119, lambda$Fn25);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment7 = C1171runtime.addToCurrentFormEnvironment(Lit124, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit124, this.Button2$Click);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit119, Lit114);
                }
                this.CurrencyConverter1 = null;
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit125, Lit108, lambda$Fn26), $result);
                } else {
                    addToComponents(Lit0, Lit126, Lit108, lambda$Fn27);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment8 = C1171runtime.addToCurrentFormEnvironment(Lit128, this.CurrencyConverter1$Got);
                } else {
                    addToFormEnvironment(Lit128, this.CurrencyConverter1$Got);
                }
                if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "CurrencyConverter1", "Got");
                } else {
                    addToEvents(Lit108, Lit129);
                }
                C1171runtime.initRuntime();
            } catch (ClassCastException e) {
                ClassCastException classCastException = e;
                Throwable th3 = th2;
                new WrongType(classCastException, "java.lang.Runnable.run()", 1, obj4);
                throw th3;
            }
        } catch (ClassCastException e2) {
            ClassCastException classCastException2 = e2;
            Throwable th4 = th;
            new WrongType(classCastException2, "java.lang.Runnable.run()", 1, obj3);
            throw th4;
        }
    }

    static Object lambda3() {
        ModuleMethod moduleMethod = C1171runtime.make$Mnyail$Mnlist;
        Pair list1 = LList.list1("BGN CHF CZK DKK EUR GBP HRK RUB UAH ILS MAD ZAR,USD,INR,JPY,MYR,PKR,SGD,LKR,BTC");
        Pair chain1 = LList.chain1(LList.chain1(LList.chain1(LList.chain4(LList.chain4(LList.chain4(LList.chain4(list1, "CHF", "CZK ", "DKK", "EUR"), "GBP", "HRK", "RUB", "UAH"), "ILS", "MAD", "ZAR", "USD"), "INR", "JPY", "MYR", "PKR"), "SGD"), "LKR"), "BTC");
        return C1171runtime.callYailPrimitive(moduleMethod, list1, Lit5, "make a list");
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "6745161059008512", Lit12);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "dovizcevirici", Lit12);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit8);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit8);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Lit21, Lit8);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit22, AlgorithmIdentifiers.NONE, Lit12);
        Object andCoerceProperty$Ex10 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit24);
        Object andCoerceProperty$Ex11 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Boolean.FALSE, Lit24);
        Object andCoerceProperty$Ex12 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "None", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "Çevirici", Lit12);
    }

    public Object Cevirici$BackPressed() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit28, "open another screen");
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit32, Lit35, Lit36, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit32, Lit37, Lit38, Lit8);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit32, Lit35, Lit36, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit32, Lit37, Lit38, Lit8);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit14, Lit42, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit43, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit49, Boolean.TRUE, Lit24);
        return C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit50, Lit51, Lit8);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit14, Lit42, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit43, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit49, Boolean.TRUE, Lit24);
        return C1171runtime.setAndCoerceProperty$Ex(Lit41, Lit50, Lit51, Lit8);
    }

    public Object From_Currency_Text_Box1$GotFocus() {
        C1171runtime.setThisForm();
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit54, C1171runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C1171runtime.$Stthe$Mnnull$Mnvalue$St), Lit55);
        Object callComponentMethod = C1171runtime.callComponentMethod(Lit53, Lit56, LList.Empty, LList.Empty);
        return C1171runtime.callComponentMethod(Lit0, Lit57, LList.Empty, LList.Empty);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit61, "USD,CHF,CZK,DKK,EUR,GBP,HRK,RUB,UAH,ILS,MAD,ZAR,BGN,INR,JPY,MYR,PKR,SGD,LKR,BTC", Lit12);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit62, Lit63, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit64, Lit46, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit65, Lit46, Lit8);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit61, "USD,CHF,CZK,DKK,EUR,GBP,HRK,RUB,UAH,ILS,MAD,ZAR,BGN,INR,JPY,MYR,PKR,SGD,LKR,BTC", Lit12);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit62, Lit63, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit64, Lit46, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit53, Lit65, Lit46, Lit8);
    }

    public Object Spinner1$AfterSelecting(Object $selection) {
        Object obj;
        Object $selection2 = C1171runtime.sanitizeComponentData($selection);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit41;
        SimpleSymbol simpleSymbol2 = Lit67;
        if ($selection2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit68);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $selection2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, obj, Lit12);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit72, Lit33, Lit34, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit72, Lit35, Lit36, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit72, Lit37, Lit38, Lit8);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit72, Lit33, Lit34, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit72, Lit35, Lit36, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit72, Lit37, Lit38, Lit8);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit14, Lit76, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit43, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit44, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit47, Lit77, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit49, Boolean.TRUE, Lit24);
        return C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit50, Lit78, Lit8);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit14, Lit76, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit43, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit44, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit47, Lit77, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit49, Boolean.TRUE, Lit24);
        return C1171runtime.setAndCoerceProperty$Ex(Lit75, Lit50, Lit78, Lit8);
    }

    public Object To_currency_Text_Box$GotFocus() {
        C1171runtime.setThisForm();
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit54, C1171runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C1171runtime.$Stthe$Mnnull$Mnvalue$St), Lit55);
        Object callComponentMethod = C1171runtime.callComponentMethod(Lit80, Lit56, LList.Empty, LList.Empty);
        return C1171runtime.callComponentMethod(Lit0, Lit57, LList.Empty, LList.Empty);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit61, "JPY,CHF,CZK,DKK,EUR,GBP,HRK,RUB,UAH,ILS,MAD,ZAR,USD,INR,BGN,MYR,PKR,SGD,LKR,BTC", Lit12);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit62, Lit83, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit64, Lit46, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit65, Lit46, Lit8);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit61, "JPY,CHF,CZK,DKK,EUR,GBP,HRK,RUB,UAH,ILS,MAD,ZAR,USD,INR,BGN,MYR,PKR,SGD,LKR,BTC", Lit12);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit62, Lit83, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit64, Lit46, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit80, Lit65, Lit46, Lit8);
    }

    public Object Spinner2$AfterSelecting(Object $selection) {
        Object obj;
        Object $selection2 = C1171runtime.sanitizeComponentData($selection);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit75;
        SimpleSymbol simpleSymbol2 = Lit67;
        if ($selection2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit68);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $selection2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, obj, Lit12);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit9, Lit10, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit33, Lit34, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit35, Lit88, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit37, Lit38, Lit8);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit9, Lit10, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit33, Lit34, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit35, Lit88, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit87, Lit37, Lit38, Lit8);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit14, Lit92, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit43, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit93, "Miktar Giriniz", Lit12);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit47, Lit94, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit95, Lit96, Lit8);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit50, Lit97, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit37, Lit98, Lit8);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit14, Lit92, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit43, Boolean.TRUE, Lit24);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit93, "Miktar Giriniz", Lit12);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit47, Lit94, Lit8);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit95, Lit96, Lit8);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit50, Lit97, Lit8);
        return C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit37, Lit98, Lit8);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit14, Lit102, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit45, Lit103, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit67, "Çevir", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit37, Lit104, Lit8);
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit14, Lit102, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit45, Lit103, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit67, "Çevir", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit101, Lit37, Lit104, Lit8);
    }

    public Object Button1$Click() {
        Object callComponentMethod;
        C1171runtime.setThisForm();
        if (C1171runtime.callYailPrimitive(C1171runtime.yail$Mnequal$Qu, LList.list2(C1171runtime.getProperty$1(Lit41, Lit67), C1171runtime.getProperty$1(Lit75, Lit67)), Lit106, "=") != Boolean.FALSE) {
            callComponentMethod = C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit67, "Lütfen Geçerli Varlık Seçiniz", Lit12);
        } else {
            Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit108, Lit109, C1171runtime.getProperty$1(Lit41, Lit67), Lit12);
            Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit108, Lit110, C1171runtime.getProperty$1(Lit75, Lit67), Lit12);
            callComponentMethod = C1171runtime.callComponentMethod(Lit108, Lit111, LList.list1(C1171runtime.getProperty$1(Lit91, Lit67)), Lit112);
        }
        return callComponentMethod;
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit67, "Sonuç", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit50, Lit116, Lit8);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit45, Lit46, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit67, "Sonuç", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit107, Lit50, Lit116, Lit8);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit14, Lit120, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit45, Lit103, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit67, "Ana Sayfa", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit37, Lit121, Lit8);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit14, Lit120, Lit8);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit45, Lit103, Lit8);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit67, "Ana Sayfa", Lit12);
        return C1171runtime.setAndCoerceProperty$Ex(Lit119, Lit37, Lit121, Lit8);
    }

    public Object Button2$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit123, "open another screen");
    }

    static Object lambda27() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit108, Lit109, "JPY", Lit12);
    }

    static Object lambda28() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit108, Lit109, "JPY", Lit12);
    }

    public Object CurrencyConverter1$Got(Object $amount) {
        Object obj;
        Object $amount2 = C1171runtime.sanitizeComponentData($amount);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit107;
        SimpleSymbol simpleSymbol2 = Lit67;
        if ($amount2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit127);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $amount2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, obj, Lit12);
    }

    /* renamed from: io.kodular.cenkertrgut.dovizcevirici.Cevirici$frame */
    /* compiled from: Cevirici.yail */
    public class frame extends ModuleBody {
        Cevirici $main;

        public frame() {
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 1:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 2:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 4:
                    CallContext callContext3 = callContext2;
                    Object obj3 = obj2;
                    Object obj4 = obj3;
                    if (!(obj3 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 6:
                    CallContext callContext4 = callContext2;
                    Object obj5 = obj2;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj6;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 11:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 12:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 13:
                    CallContext callContext5 = callContext2;
                    Object obj7 = obj2;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Cevirici)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 29:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 37:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 52:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod2, obj2, callContext2);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 3:
                    CallContext callContext3 = callContext2;
                    Object obj5 = obj3;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj6;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 4:
                    CallContext callContext4 = callContext2;
                    Object obj7 = obj3;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj8;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 7:
                    CallContext callContext5 = callContext2;
                    Object obj9 = obj3;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext5.value1 = obj10;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 8:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 10:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 16:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod2, obj3, obj4, callContext2);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 9:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                case 14:
                    CallContext callContext3 = callContext2;
                    Object obj9 = obj5;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Cevirici)) {
                        return -786431;
                    }
                    callContext3.value1 = obj10;
                    CallContext callContext4 = callContext2;
                    Object obj11 = obj6;
                    Object obj12 = obj11;
                    if (!(obj11 instanceof Component)) {
                        return -786430;
                    }
                    callContext4.value2 = obj12;
                    CallContext callContext5 = callContext2;
                    Object obj13 = obj7;
                    Object obj14 = obj13;
                    if (!(obj13 instanceof String)) {
                        return -786429;
                    }
                    callContext5.value3 = obj14;
                    CallContext callContext6 = callContext2;
                    Object obj15 = obj8;
                    Object obj16 = obj15;
                    if (!(obj15 instanceof String)) {
                        return -786428;
                    }
                    callContext6.value4 = obj16;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                case 15:
                    CallContext callContext7 = callContext2;
                    Object obj17 = obj5;
                    Object obj18 = obj17;
                    if (!(obj17 instanceof Cevirici)) {
                        return -786431;
                    }
                    callContext7.value1 = obj18;
                    CallContext callContext8 = callContext2;
                    Object obj19 = obj6;
                    Object obj20 = obj19;
                    if (!(obj19 instanceof Component)) {
                        return -786430;
                    }
                    callContext8.value2 = obj20;
                    CallContext callContext9 = callContext2;
                    Object obj21 = obj7;
                    Object obj22 = obj21;
                    if (!(obj21 instanceof String)) {
                        return -786429;
                    }
                    callContext9.value3 = obj22;
                    CallContext callContext10 = callContext2;
                    Object obj23 = obj8;
                    Object obj24 = obj23;
                    Object obj25 = obj23;
                    if (1 == 0) {
                        return -786428;
                    }
                    callContext10.value4 = obj24;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod2, obj5, obj6, obj7, obj8, callContext2);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            Throwable th;
            Throwable th2;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            switch (moduleMethod2.selector) {
                case 1:
                    return this.$main.getSimpleName(obj2);
                case 2:
                    this.$main.androidLogForm(obj2);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj2);
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th3 = th2;
                        new WrongType(classCastException, "lookup-in-form-environment", 1, obj2);
                        throw th3;
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj2) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th4 = th;
                        new WrongType(classCastException2, "is-bound-in-form-environment", 1, obj2);
                        throw th4;
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj2);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj2);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj2);
                    return Values.empty;
                case 29:
                    return this.$main.Spinner1$AfterSelecting(obj2);
                case 37:
                    return this.$main.Spinner2$AfterSelecting(obj2);
                case 52:
                    return this.$main.CurrencyConverter1$Got(obj2);
                default:
                    return super.apply1(moduleMethod2, obj2);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            Throwable th4;
            Throwable th5;
            Throwable th6;
            Throwable th7;
            Throwable th8;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            switch (moduleMethod2.selector) {
                case 9:
                    this.$main.addToComponents(obj5, obj6, obj7, obj8);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj5, (String) obj6, (String) obj7, (Object[]) obj8) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    ClassCastException classCastException = e;
                                    Throwable th9 = th8;
                                    new WrongType(classCastException, "dispatchEvent", 4, obj8);
                                    throw th9;
                                }
                            } catch (ClassCastException e2) {
                                ClassCastException classCastException2 = e2;
                                Throwable th10 = th7;
                                new WrongType(classCastException2, "dispatchEvent", 3, obj7);
                                throw th10;
                            }
                        } catch (ClassCastException e3) {
                            ClassCastException classCastException3 = e3;
                            Throwable th11 = th6;
                            new WrongType(classCastException3, "dispatchEvent", 2, obj6);
                            throw th11;
                        }
                    } catch (ClassCastException e4) {
                        ClassCastException classCastException4 = e4;
                        Throwable th12 = th5;
                        new WrongType(classCastException4, "dispatchEvent", 1, obj5);
                        throw th12;
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj5, (String) obj6, obj7 != Boolean.FALSE, (Object[]) obj8);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    ClassCastException classCastException5 = e5;
                                    Throwable th13 = th4;
                                    new WrongType(classCastException5, "dispatchGenericEvent", 4, obj8);
                                    throw th13;
                                }
                            } catch (ClassCastException e6) {
                                ClassCastException classCastException6 = e6;
                                Throwable th14 = th3;
                                new WrongType(classCastException6, "dispatchGenericEvent", 3, obj7);
                                throw th14;
                            }
                        } catch (ClassCastException e7) {
                            ClassCastException classCastException7 = e7;
                            Throwable th15 = th2;
                            new WrongType(classCastException7, "dispatchGenericEvent", 2, obj6);
                            throw th15;
                        }
                    } catch (ClassCastException e8) {
                        ClassCastException classCastException8 = e8;
                        Throwable th16 = th;
                        new WrongType(classCastException8, "dispatchGenericEvent", 1, obj5);
                        throw th16;
                    }
                default:
                    return super.apply4(moduleMethod2, obj5, obj6, obj7, obj8);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            switch (moduleMethod2.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th4 = th3;
                        new WrongType(classCastException, "add-to-form-environment", 1, obj3);
                        throw th4;
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj3, obj4);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th2;
                        new WrongType(classCastException2, "lookup-in-form-environment", 1, obj3);
                        throw th5;
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        ClassCastException classCastException3 = e3;
                        Throwable th6 = th;
                        new WrongType(classCastException3, "add-to-global-var-environment", 1, obj3);
                        throw th6;
                    }
                case 8:
                    this.$main.addToEvents(obj3, obj4);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj3, obj4);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Cevirici.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Cevirici.lambda3();
                case 20:
                    return Cevirici.lambda4();
                case 21:
                    return this.$main.Cevirici$BackPressed();
                case 22:
                    return Cevirici.lambda5();
                case 23:
                    return Cevirici.lambda6();
                case 24:
                    return Cevirici.lambda7();
                case 25:
                    return Cevirici.lambda8();
                case 26:
                    return this.$main.From_Currency_Text_Box1$GotFocus();
                case 27:
                    return Cevirici.lambda9();
                case 28:
                    return Cevirici.lambda10();
                case 30:
                    return Cevirici.lambda11();
                case 31:
                    return Cevirici.lambda12();
                case 32:
                    return Cevirici.lambda13();
                case 33:
                    return Cevirici.lambda14();
                case 34:
                    return this.$main.To_currency_Text_Box$GotFocus();
                case 35:
                    return Cevirici.lambda15();
                case 36:
                    return Cevirici.lambda16();
                case 38:
                    return Cevirici.lambda17();
                case 39:
                    return Cevirici.lambda18();
                case 40:
                    return Cevirici.lambda19();
                case 41:
                    return Cevirici.lambda20();
                case 42:
                    return Cevirici.lambda21();
                case 43:
                    return Cevirici.lambda22();
                case 44:
                    return this.$main.Button1$Click();
                case 45:
                    return Cevirici.lambda23();
                case 46:
                    return Cevirici.lambda24();
                case 47:
                    return Cevirici.lambda25();
                case 48:
                    return Cevirici.lambda26();
                case 49:
                    return this.$main.Button2$Click();
                case 50:
                    return Cevirici.lambda27();
                case 51:
                    return Cevirici.lambda28();
                default:
                    return super.apply0(moduleMethod2);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 17:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 18:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 19:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 20:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 21:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 22:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 23:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 24:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 25:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 26:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 27:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 28:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 30:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 31:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 32:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 33:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 34:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 35:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 36:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 38:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 39:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 40:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 41:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 42:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 43:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 44:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 45:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 46:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 47:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 48:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 49:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 50:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 51:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.form$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj) {
        Object obj2;
        Symbol name = symbol;
        Object default$Mnvalue = obj;
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (!x ? !x : !this.form$Mnenvironment.isBound(name)) {
            obj2 = default$Mnvalue;
        } else {
            obj2 = this.form$Mnenvironment.get(name);
        }
        return obj2;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.global$Mnvar$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C1192lists.cons(C1192lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C1192lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C1192lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C1192lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        Object obj = error;
        RetValManager.sendError(obj == null ? null : obj.toString());
    }

    public void processException(Object obj) {
        Object ex = obj;
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component component, String str, String str2, Object[] objArr) {
        boolean z;
        boolean z2;
        Component componentObject = component;
        String registeredComponentName = str;
        String eventName = str2;
        Object[] args = objArr;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        } else if (lookupInFormEnvironment(registeredObject) == componentObject) {
            try {
                Object apply2 = Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                z2 = true;
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
                z2 = false;
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        return z;
    }

    public void dispatchGenericEvent(Component component, String str, boolean z, Object[] objArr) {
        Boolean bool;
        Component componentObject = component;
        String eventName = str;
        boolean notAlreadyHandled = z;
        Object[] args = objArr;
        Object[] objArr2 = new Object[4];
        objArr2[0] = "any$";
        Object[] objArr3 = objArr2;
        objArr3[1] = getSimpleName(componentObject);
        Object[] objArr4 = objArr3;
        objArr4[2] = "$";
        Object[] objArr5 = objArr4;
        objArr5[3] = eventName;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(objArr5)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Object obj = handler;
                Component component2 = componentObject;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object apply2 = apply.apply2(obj, C1192lists.cons(component2, C1192lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object obj) {
        Object eventName = obj;
        Object obj2 = componentName;
        String obj3 = obj2 == null ? null : obj2.toString();
        Object obj4 = eventName;
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj3, obj4 == null ? null : obj4.toString())));
    }

    public void $define() {
        Object obj;
        Throwable th;
        Object obj2;
        Throwable th2;
        Object obj3;
        Throwable th3;
        Object obj4;
        Throwable th4;
        Object obj5;
        Throwable th5;
        Object obj6;
        Throwable th6;
        Object obj7;
        Throwable th7;
        Object obj8;
        Throwable th8;
        Throwable th9;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception e) {
            Exception exception = e;
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Cevirici = this;
        addToFormEnvironment(Lit0, this);
        Object obj9 = this.events$Mnto$Mnregister;
        while (true) {
            Object obj10 = obj9;
            if (obj10 == LList.Empty) {
                break;
            }
            Object obj11 = obj10;
            Object obj12 = obj11;
            try {
                Pair arg0 = (Pair) obj11;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C1192lists.car.apply1(event$Mninfo);
                String obj13 = apply1 == null ? null : apply1.toString();
                Object apply12 = C1192lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj13, apply12 == null ? null : apply12.toString());
                obj9 = arg0.getCdr();
            } catch (ClassCastException e2) {
                ClassCastException classCastException = e2;
                Throwable th10 = th9;
                new WrongType(classCastException, "arg0", -2, obj12);
                throw th10;
            }
        }
        try {
            LList components = C1192lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            LList event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj14 = event$Mninfo2;
                obj6 = obj14;
                Pair arg02 = (Pair) obj14;
                Object component$Mninfo = arg02.getCar();
                Object apply13 = C1192lists.caddr.apply1(component$Mninfo);
                Object apply14 = C1192lists.cadddr.apply1(component$Mninfo);
                Object component$Mntype = C1192lists.cadr.apply1(component$Mninfo);
                Object apply15 = C1192lists.car.apply1(component$Mninfo);
                obj7 = apply15;
                Object component$Mnname = apply13;
                Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply15));
                Object apply3 = SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                Object obj15 = component$Mnname;
                obj8 = obj15;
                addToFormEnvironment((Symbol) obj15, component$Mnobject);
                event$Mninfo2 = arg02.getCdr();
            }
            LList reverse = C1192lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse != LList.Empty) {
                Object obj16 = reverse;
                obj4 = obj16;
                Pair arg03 = (Pair) obj16;
                Object var$Mnval = arg03.getCar();
                Object apply16 = C1192lists.car.apply1(var$Mnval);
                obj5 = apply16;
                addToGlobalVarEnvironment((Symbol) apply16, Scheme.applyToArgs.apply1(C1192lists.cadr.apply1(var$Mnval)));
                reverse = arg03.getCdr();
            }
            Object reverse2 = C1192lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse2 != LList.Empty) {
                Object obj17 = reverse2;
                obj3 = obj17;
                Pair arg04 = (Pair) obj17;
                Object force = misc.force(arg04.getCar());
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            LList lList = component$Mndescriptors;
            while (lList != LList.Empty) {
                Object obj18 = lList;
                obj2 = obj18;
                Pair arg05 = (Pair) obj18;
                Object component$Mninfo2 = arg05.getCar();
                Object apply17 = C1192lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C1192lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Object apply18 = Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                lList = arg05.getCdr();
            }
            LList lList2 = component$Mndescriptors;
            while (lList2 != LList.Empty) {
                Object obj19 = lList2;
                obj = obj19;
                Pair arg06 = (Pair) obj19;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C1192lists.caddr.apply1(component$Mninfo3);
                Object apply19 = C1192lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                lList2 = arg06.getCdr();
            }
        } catch (ClassCastException e3) {
            ClassCastException classCastException2 = e3;
            Throwable th11 = th;
            new WrongType(classCastException2, "arg0", -2, obj);
            throw th11;
        } catch (ClassCastException e4) {
            ClassCastException classCastException3 = e4;
            Throwable th12 = th2;
            new WrongType(classCastException3, "arg0", -2, obj2);
            throw th12;
        } catch (ClassCastException e5) {
            ClassCastException classCastException4 = e5;
            Throwable th13 = th3;
            new WrongType(classCastException4, "arg0", -2, obj3);
            throw th13;
        } catch (ClassCastException e6) {
            ClassCastException classCastException5 = e6;
            Throwable th14 = th5;
            new WrongType(classCastException5, "add-to-global-var-environment", 0, obj5);
            throw th14;
        } catch (ClassCastException e7) {
            ClassCastException classCastException6 = e7;
            Throwable th15 = th4;
            new WrongType(classCastException6, "arg0", -2, obj4);
            throw th15;
        } catch (ClassCastException e8) {
            ClassCastException classCastException7 = e8;
            Throwable th16 = th8;
            new WrongType(classCastException7, "add-to-form-environment", 0, obj8);
            throw th16;
        } catch (ClassCastException e9) {
            ClassCastException classCastException8 = e9;
            Throwable th17 = th7;
            new WrongType(classCastException8, "lookup-in-form-environment", 0, obj7);
            throw th17;
        } catch (ClassCastException e10) {
            ClassCastException classCastException9 = e10;
            Throwable th18 = th6;
            new WrongType(classCastException9, "arg0", -2, obj6);
            throw th18;
        } catch (YailRuntimeError e11) {
            processException(e11);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        LList symbols = LList.makeList(argsArray, 0);
        LList lList = symbols;
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 == LList.Empty) {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                Object obj5 = apply2;
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e) {
                    ClassCastException classCastException = e;
                    Throwable th4 = th;
                    new WrongType(classCastException, "string->symbol", 1, obj5);
                    throw th4;
                }
            } else {
                Object obj6 = obj4;
                Object obj7 = obj6;
                try {
                    Pair arg0 = (Pair) obj6;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    Object obj8 = car;
                    try {
                        obj2 = Pair.make(misc.symbol$To$String((Symbol) car), obj3);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th3;
                        new WrongType(classCastException2, "symbol->string", 1, obj8);
                        throw th5;
                    }
                } catch (ClassCastException e3) {
                    ClassCastException classCastException3 = e3;
                    Throwable th6 = th2;
                    new WrongType(classCastException3, "arg0", -2, obj7);
                    throw th6;
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}

package p004io.kodular.cenkertrgut.dovizcevirici;

import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidBottomSheet;
import com.google.appinventor.components.runtime.MakeroidCardView;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.ErrorMessages;
import com.google.appinventor.components.runtime.util.FullScreenVideoUtil;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.appinventor.components.runtime.util.ScreenDensityUtil;
import com.google.youngandroid.C1171runtime;
import com.henry.WebScrapper.C1289WebScrapper;
import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
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
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.Telnet;
import kawa.lang.Promise;
import kawa.lib.C1192lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import org.jose4j.jws.AlgorithmIdentifiers;

/* renamed from: io.kodular.cenkertrgut.dovizcevirici.Screen1 */
/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final PairWithPosition Lit10 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33959), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33953);
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final IntNum Lit104 = IntNum.make(7);
    static final SimpleSymbol Lit105;
    static final IntNum Lit106 = IntNum.make(-1015);
    static final SimpleSymbol Lit107;
    static final IntNum Lit108;
    static final IntNum Lit109 = IntNum.make(-1090);
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final PairWithPosition Lit111 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 323663);
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final FString Lit114;
    static final SimpleSymbol Lit115;
    static final FString Lit116;
    static final FString Lit117;
    static final SimpleSymbol Lit118;
    static final IntNum Lit119 = IntNum.make(-1005);
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34344), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34338);
    static final FString Lit120;
    static final FString Lit121;
    static final SimpleSymbol Lit122;
    static final SimpleSymbol Lit123;
    static final IntNum Lit124 = IntNum.make(35);
    static final SimpleSymbol Lit125;
    static final IntNum Lit126 = IntNum.make(9);
    static final SimpleSymbol Lit127;
    static final SimpleSymbol Lit128;
    static final SimpleSymbol Lit129;
    static final SimpleSymbol Lit13;
    static final IntNum Lit130;
    static final FString Lit131;
    static final FString Lit132;
    static final SimpleSymbol Lit133;
    static final IntNum Lit134 = IntNum.make(-1005);
    static final FString Lit135;
    static final FString Lit136;
    static final SimpleSymbol Lit137;
    static final FString Lit138;
    static final FString Lit139;
    static final PairWithPosition Lit14 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34734), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34728);
    static final SimpleSymbol Lit140;
    static final FString Lit141;
    static final FString Lit142;
    static final SimpleSymbol Lit143;
    static final SimpleSymbol Lit144;
    static final IntNum Lit145 = IntNum.make(15);
    static final IntNum Lit146;
    static final FString Lit147;
    static final FString Lit148;
    static final SimpleSymbol Lit149;
    static final SimpleSymbol Lit15;
    static final IntNum Lit150 = IntNum.make(17);
    static final IntNum Lit151;
    static final FString Lit152;
    static final FString Lit153;
    static final SimpleSymbol Lit154;
    static final FString Lit155;
    static final FString Lit156;
    static final SimpleSymbol Lit157;
    static final IntNum Lit158 = IntNum.make(12);
    static final IntNum Lit159;
    static final PairWithPosition Lit16 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35125), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35119);
    static final FString Lit160;
    static final FString Lit161;
    static final SimpleSymbol Lit162;
    static final IntNum Lit163;
    static final FString Lit164;
    static final FString Lit165;
    static final SimpleSymbol Lit166;
    static final FString Lit167;
    static final FString Lit168;
    static final SimpleSymbol Lit169;
    static final SimpleSymbol Lit17;
    static final IntNum Lit170;
    static final FString Lit171;
    static final FString Lit172;
    static final SimpleSymbol Lit173;
    static final IntNum Lit174;
    static final FString Lit175;
    static final FString Lit176;
    static final SimpleSymbol Lit177;
    static final IntNum Lit178 = IntNum.make(-1005);
    static final FString Lit179;
    static final PairWithPosition Lit18 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35520), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35514);
    static final FString Lit180;
    static final SimpleSymbol Lit181;
    static final IntNum Lit182;
    static final IntNum Lit183 = IntNum.make(-1015);
    static final IntNum Lit184;
    static final IntNum Lit185 = IntNum.make(-1090);
    static final FString Lit186;
    static final PairWithPosition Lit187 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 1085519);
    static final SimpleSymbol Lit188;
    static final FString Lit189;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit190;
    static final FString Lit191;
    static final FString Lit192;
    static final SimpleSymbol Lit193;
    static final IntNum Lit194 = IntNum.make(-1005);
    static final FString Lit195;
    static final FString Lit196;
    static final SimpleSymbol Lit197;
    static final IntNum Lit198;
    static final FString Lit199;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35916), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35910);
    static final FString Lit200;
    static final SimpleSymbol Lit201;
    static final IntNum Lit202 = IntNum.make(-1005);
    static final FString Lit203;
    static final FString Lit204;
    static final SimpleSymbol Lit205;
    static final FString Lit206;
    static final FString Lit207;
    static final SimpleSymbol Lit208;
    static final FString Lit209;
    static final SimpleSymbol Lit21;
    static final FString Lit210;
    static final SimpleSymbol Lit211;
    static final IntNum Lit212;
    static final FString Lit213;
    static final FString Lit214;
    static final SimpleSymbol Lit215;
    static final IntNum Lit216;
    static final FString Lit217;
    static final FString Lit218;
    static final SimpleSymbol Lit219;
    static final PairWithPosition Lit22 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36308), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36302);
    static final FString Lit220;
    static final FString Lit221;
    static final SimpleSymbol Lit222;
    static final IntNum Lit223;
    static final FString Lit224;
    static final FString Lit225;
    static final SimpleSymbol Lit226;
    static final IntNum Lit227;
    static final FString Lit228;
    static final FString Lit229;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit230;
    static final FString Lit231;
    static final FString Lit232;
    static final SimpleSymbol Lit233;
    static final IntNum Lit234;
    static final FString Lit235;
    static final FString Lit236;
    static final SimpleSymbol Lit237;
    static final IntNum Lit238;
    static final FString Lit239;
    static final PairWithPosition Lit24 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36701), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36695);
    static final FString Lit240;
    static final SimpleSymbol Lit241;
    static final IntNum Lit242 = IntNum.make(-1005);
    static final FString Lit243;
    static final FString Lit244;
    static final SimpleSymbol Lit245;
    static final IntNum Lit246;
    static final IntNum Lit247 = IntNum.make(-1015);
    static final IntNum Lit248;
    static final IntNum Lit249 = IntNum.make(-1090);
    static final SimpleSymbol Lit25;
    static final FString Lit250;
    static final PairWithPosition Lit251 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 1847375);
    static final SimpleSymbol Lit252;
    static final FString Lit253;
    static final SimpleSymbol Lit254;
    static final FString Lit255;
    static final FString Lit256;
    static final SimpleSymbol Lit257;
    static final IntNum Lit258 = IntNum.make(-1005);
    static final FString Lit259;
    static final PairWithPosition Lit26 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37090), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37084);
    static final FString Lit260;
    static final SimpleSymbol Lit261;
    static final IntNum Lit262;
    static final FString Lit263;
    static final FString Lit264;
    static final SimpleSymbol Lit265;
    static final IntNum Lit266 = IntNum.make(-1005);
    static final FString Lit267;
    static final FString Lit268;
    static final SimpleSymbol Lit269;
    static final SimpleSymbol Lit27;
    static final FString Lit270;
    static final FString Lit271;
    static final SimpleSymbol Lit272;
    static final FString Lit273;
    static final FString Lit274;
    static final SimpleSymbol Lit275;
    static final IntNum Lit276;
    static final FString Lit277;
    static final FString Lit278;
    static final SimpleSymbol Lit279;
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37480), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37474);
    static final IntNum Lit280;
    static final FString Lit281;
    static final FString Lit282;
    static final SimpleSymbol Lit283;
    static final FString Lit284;
    static final FString Lit285;
    static final SimpleSymbol Lit286;
    static final IntNum Lit287;
    static final FString Lit288;
    static final FString Lit289;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit290;
    static final IntNum Lit291;
    static final FString Lit292;
    static final FString Lit293;
    static final SimpleSymbol Lit294;
    static final FString Lit295;
    static final FString Lit296;
    static final SimpleSymbol Lit297;
    static final IntNum Lit298;
    static final FString Lit299;
    static final SimpleSymbol Lit3;
    static final PairWithPosition Lit30 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37874), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37868);
    static final FString Lit300;
    static final SimpleSymbol Lit301;
    static final IntNum Lit302;
    static final FString Lit303;
    static final FString Lit304;
    static final SimpleSymbol Lit305;
    static final IntNum Lit306 = IntNum.make(-1005);
    static final FString Lit307;
    static final FString Lit308;
    static final SimpleSymbol Lit309;
    static final SimpleSymbol Lit31;
    static final IntNum Lit310;
    static final IntNum Lit311 = IntNum.make(-1015);
    static final IntNum Lit312;
    static final IntNum Lit313 = IntNum.make(-1090);
    static final FString Lit314;
    static final PairWithPosition Lit315 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 2609231);
    static final SimpleSymbol Lit316;
    static final FString Lit317;
    static final SimpleSymbol Lit318;
    static final FString Lit319;
    static final PairWithPosition Lit32 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38269), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38263);
    static final FString Lit320;
    static final SimpleSymbol Lit321;
    static final IntNum Lit322 = IntNum.make(-1005);
    static final FString Lit323;
    static final FString Lit324;
    static final SimpleSymbol Lit325;
    static final IntNum Lit326 = IntNum.make(10);
    static final IntNum Lit327;
    static final FString Lit328;
    static final FString Lit329;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit330;
    static final IntNum Lit331 = IntNum.make(-1005);
    static final FString Lit332;
    static final FString Lit333;
    static final SimpleSymbol Lit334;
    static final FString Lit335;
    static final FString Lit336;
    static final SimpleSymbol Lit337;
    static final FString Lit338;
    static final FString Lit339;
    static final PairWithPosition Lit34 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38568), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38562);
    static final SimpleSymbol Lit340;
    static final IntNum Lit341;
    static final FString Lit342;
    static final FString Lit343;
    static final SimpleSymbol Lit344;
    static final IntNum Lit345;
    static final FString Lit346;
    static final FString Lit347;
    static final SimpleSymbol Lit348;
    static final FString Lit349;
    static final SimpleSymbol Lit35;
    static final FString Lit350;
    static final SimpleSymbol Lit351;
    static final IntNum Lit352;
    static final FString Lit353;
    static final FString Lit354;
    static final SimpleSymbol Lit355;
    static final IntNum Lit356;
    static final FString Lit357;
    static final FString Lit358;
    static final SimpleSymbol Lit359;
    static final PairWithPosition Lit36 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38868), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38862);
    static final FString Lit360;
    static final FString Lit361;
    static final SimpleSymbol Lit362;
    static final IntNum Lit363;
    static final FString Lit364;
    static final FString Lit365;
    static final SimpleSymbol Lit366;
    static final IntNum Lit367;
    static final FString Lit368;
    static final FString Lit369;
    static final PairWithPosition Lit37 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33178), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33172);
    static final SimpleSymbol Lit370;
    static final IntNum Lit371 = IntNum.make(-1005);
    static final FString Lit372;
    static final FString Lit373;
    static final SimpleSymbol Lit374;
    static final IntNum Lit375;
    static final IntNum Lit376 = IntNum.make(-1015);
    static final IntNum Lit377;
    static final IntNum Lit378 = IntNum.make(-1090);
    static final FString Lit379;
    static final PairWithPosition Lit38 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33575), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33569);
    static final PairWithPosition Lit380 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 3371087);
    static final SimpleSymbol Lit381;
    static final FString Lit382;
    static final SimpleSymbol Lit383;
    static final FString Lit384;
    static final FString Lit385;
    static final SimpleSymbol Lit386;
    static final IntNum Lit387 = IntNum.make(-1005);
    static final FString Lit388;
    static final FString Lit389;
    static final PairWithPosition Lit39 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33959), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33953);
    static final SimpleSymbol Lit390;
    static final IntNum Lit391;
    static final FString Lit392;
    static final FString Lit393;
    static final SimpleSymbol Lit394;
    static final IntNum Lit395 = IntNum.make(-1005);
    static final FString Lit396;
    static final FString Lit397;
    static final SimpleSymbol Lit398;
    static final FString Lit399;
    static final SimpleSymbol Lit4;
    static final PairWithPosition Lit40 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34344), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34338);
    static final FString Lit400;
    static final SimpleSymbol Lit401;
    static final FString Lit402;
    static final FString Lit403;
    static final SimpleSymbol Lit404;
    static final IntNum Lit405;
    static final FString Lit406;
    static final FString Lit407;
    static final SimpleSymbol Lit408;
    static final IntNum Lit409;
    static final PairWithPosition Lit41 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34734), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 34728);
    static final FString Lit410;
    static final FString Lit411;
    static final SimpleSymbol Lit412;
    static final FString Lit413;
    static final FString Lit414;
    static final SimpleSymbol Lit415;
    static final IntNum Lit416;
    static final FString Lit417;
    static final FString Lit418;
    static final SimpleSymbol Lit419;
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35125), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35119);
    static final IntNum Lit420;
    static final FString Lit421;
    static final FString Lit422;
    static final SimpleSymbol Lit423;
    static final FString Lit424;
    static final FString Lit425;
    static final SimpleSymbol Lit426;
    static final IntNum Lit427;
    static final FString Lit428;
    static final FString Lit429;
    static final PairWithPosition Lit43 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35520), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35514);
    static final SimpleSymbol Lit430;
    static final IntNum Lit431;
    static final FString Lit432;
    static final FString Lit433;
    static final SimpleSymbol Lit434;
    static final IntNum Lit435 = IntNum.make(-1005);
    static final FString Lit436;
    static final FString Lit437;
    static final SimpleSymbol Lit438;
    static final IntNum Lit439;
    static final PairWithPosition Lit44 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35916), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 35910);
    static final IntNum Lit440 = IntNum.make(-1015);
    static final IntNum Lit441;
    static final IntNum Lit442 = IntNum.make(-1090);
    static final FString Lit443;
    static final PairWithPosition Lit444 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 4132943);
    static final SimpleSymbol Lit445;
    static final FString Lit446;
    static final SimpleSymbol Lit447;
    static final FString Lit448;
    static final FString Lit449;
    static final PairWithPosition Lit45 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36308), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36302);
    static final SimpleSymbol Lit450;
    static final IntNum Lit451 = IntNum.make(-1005);
    static final FString Lit452;
    static final FString Lit453;
    static final SimpleSymbol Lit454;
    static final IntNum Lit455;
    static final FString Lit456;
    static final FString Lit457;
    static final SimpleSymbol Lit458;
    static final IntNum Lit459 = IntNum.make(-1005);
    static final PairWithPosition Lit46 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36701), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 36695);
    static final FString Lit460;
    static final FString Lit461;
    static final SimpleSymbol Lit462;
    static final FString Lit463;
    static final FString Lit464;
    static final SimpleSymbol Lit465;
    static final FString Lit466;
    static final FString Lit467;
    static final SimpleSymbol Lit468;
    static final IntNum Lit469;
    static final PairWithPosition Lit47 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37090), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37084);
    static final FString Lit470;
    static final FString Lit471;
    static final SimpleSymbol Lit472;
    static final IntNum Lit473;
    static final FString Lit474;
    static final FString Lit475;
    static final SimpleSymbol Lit476;
    static final FString Lit477;
    static final FString Lit478;
    static final SimpleSymbol Lit479;
    static final PairWithPosition Lit48 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37480), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37474);
    static final IntNum Lit480;
    static final FString Lit481;
    static final FString Lit482;
    static final SimpleSymbol Lit483;
    static final IntNum Lit484;
    static final FString Lit485;
    static final FString Lit486;
    static final SimpleSymbol Lit487;
    static final FString Lit488;
    static final FString Lit489;
    static final PairWithPosition Lit49 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37874), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 37868);
    static final SimpleSymbol Lit490;
    static final IntNum Lit491;
    static final FString Lit492;
    static final FString Lit493;
    static final SimpleSymbol Lit494;
    static final IntNum Lit495;
    static final FString Lit496;
    static final FString Lit497;
    static final SimpleSymbol Lit498;
    static final IntNum Lit499 = IntNum.make(-1005);
    static final SimpleSymbol Lit5;
    static final PairWithPosition Lit50 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38269), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38263);
    static final FString Lit500;
    static final FString Lit501;
    static final SimpleSymbol Lit502;
    static final IntNum Lit503;
    static final IntNum Lit504 = IntNum.make(-1015);
    static final IntNum Lit505;
    static final IntNum Lit506 = IntNum.make(-1090);
    static final FString Lit507;
    static final PairWithPosition Lit508 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 4894799);
    static final SimpleSymbol Lit509;
    static final PairWithPosition Lit51 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38568), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38562);
    static final FString Lit510;
    static final SimpleSymbol Lit511;
    static final FString Lit512;
    static final FString Lit513;
    static final SimpleSymbol Lit514;
    static final IntNum Lit515 = IntNum.make(-1005);
    static final FString Lit516;
    static final FString Lit517;
    static final SimpleSymbol Lit518;
    static final SimpleSymbol Lit519;
    static final PairWithPosition Lit52 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38868), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 38862);
    static final IntNum Lit520;
    static final FString Lit521;
    static final FString Lit522;
    static final SimpleSymbol Lit523;
    static final IntNum Lit524 = IntNum.make(-1005);
    static final FString Lit525;
    static final FString Lit526;
    static final SimpleSymbol Lit527;
    static final FString Lit528;
    static final FString Lit529;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit530;
    static final FString Lit531;
    static final FString Lit532;
    static final SimpleSymbol Lit533;
    static final IntNum Lit534;
    static final FString Lit535;
    static final FString Lit536;
    static final SimpleSymbol Lit537;
    static final IntNum Lit538;
    static final FString Lit539;
    static final SimpleSymbol Lit54;
    static final FString Lit540;
    static final SimpleSymbol Lit541;
    static final FString Lit542;
    static final FString Lit543;
    static final SimpleSymbol Lit544;
    static final IntNum Lit545;
    static final FString Lit546;
    static final FString Lit547;
    static final SimpleSymbol Lit548;
    static final IntNum Lit549;
    static final SimpleSymbol Lit55;
    static final FString Lit550;
    static final FString Lit551;
    static final SimpleSymbol Lit552;
    static final FString Lit553;
    static final FString Lit554;
    static final SimpleSymbol Lit555;
    static final IntNum Lit556;
    static final FString Lit557;
    static final FString Lit558;
    static final SimpleSymbol Lit559;
    static final IntNum Lit56;
    static final IntNum Lit560;
    static final FString Lit561;
    static final FString Lit562;
    static final SimpleSymbol Lit563;
    static final IntNum Lit564 = IntNum.make(-1005);
    static final FString Lit565;
    static final FString Lit566;
    static final SimpleSymbol Lit567;
    static final IntNum Lit568;
    static final IntNum Lit569 = IntNum.make(-1015);
    static final SimpleSymbol Lit57;
    static final IntNum Lit570;
    static final IntNum Lit571 = IntNum.make(-1090);
    static final FString Lit572;
    static final PairWithPosition Lit573 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 5664847);
    static final SimpleSymbol Lit574;
    static final FString Lit575;
    static final SimpleSymbol Lit576;
    static final FString Lit577;
    static final FString Lit578;
    static final SimpleSymbol Lit579;
    static final SimpleSymbol Lit58;
    static final IntNum Lit580 = IntNum.make(-1005);
    static final FString Lit581;
    static final FString Lit582;
    static final SimpleSymbol Lit583;
    static final IntNum Lit584;
    static final FString Lit585;
    static final FString Lit586;
    static final SimpleSymbol Lit587;
    static final IntNum Lit588 = IntNum.make(-1005);
    static final FString Lit589;
    static final IntNum Lit59 = IntNum.make(3);
    static final FString Lit590;
    static final SimpleSymbol Lit591;
    static final FString Lit592;
    static final FString Lit593;
    static final SimpleSymbol Lit594;
    static final FString Lit595;
    static final FString Lit596;
    static final SimpleSymbol Lit597;
    static final IntNum Lit598;
    static final FString Lit599;
    static final PairWithPosition Lit6 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33178), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33172);
    static final SimpleSymbol Lit60;
    static final FString Lit600;
    static final SimpleSymbol Lit601;
    static final IntNum Lit602;
    static final FString Lit603;
    static final FString Lit604;
    static final SimpleSymbol Lit605;
    static final FString Lit606;
    static final FString Lit607;
    static final SimpleSymbol Lit608;
    static final IntNum Lit609;
    static final IntNum Lit61 = IntNum.make(2);
    static final FString Lit610;
    static final FString Lit611;
    static final SimpleSymbol Lit612;
    static final IntNum Lit613;
    static final FString Lit614;
    static final FString Lit615;
    static final SimpleSymbol Lit616;
    static final IntNum Lit617 = IntNum.make(-1015);
    static final FString Lit618;
    static final FString Lit619;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit620;
    static final IntNum Lit621 = IntNum.make(-1005);
    static final FString Lit622;
    static final FString Lit623;
    static final SimpleSymbol Lit624;
    static final IntNum Lit625;
    static final IntNum Lit626 = IntNum.make(-1015);
    static final IntNum Lit627;
    static final IntNum Lit628 = IntNum.make(-1090);
    static final FString Lit629;
    static final SimpleSymbol Lit63;
    static final PairWithPosition Lit630 = PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6328399);
    static final SimpleSymbol Lit631;
    static final FString Lit632;
    static final SimpleSymbol Lit633;
    static final FString Lit634;
    static final FString Lit635;
    static final SimpleSymbol Lit636;
    static final IntNum Lit637 = IntNum.make(-1005);
    static final FString Lit638;
    static final FString Lit639;
    static final SimpleSymbol Lit64;
    static final SimpleSymbol Lit640;
    static final IntNum Lit641;
    static final FString Lit642;
    static final FString Lit643;
    static final SimpleSymbol Lit644;
    static final IntNum Lit645 = IntNum.make(-1005);
    static final FString Lit646;
    static final FString Lit647;
    static final SimpleSymbol Lit648;
    static final FString Lit649;
    static final IntNum Lit65;
    static final FString Lit650;
    static final SimpleSymbol Lit651;
    static final FString Lit652;
    static final FString Lit653;
    static final SimpleSymbol Lit654;
    static final IntNum Lit655;
    static final FString Lit656;
    static final FString Lit657;
    static final SimpleSymbol Lit658;
    static final IntNum Lit659;
    static final SimpleSymbol Lit66;
    static final FString Lit660;
    static final FString Lit661;
    static final SimpleSymbol Lit662;
    static final FString Lit663;
    static final FString Lit664;
    static final SimpleSymbol Lit665;
    static final IntNum Lit666;
    static final FString Lit667;
    static final FString Lit668;
    static final SimpleSymbol Lit669;
    static final IntNum Lit67;
    static final IntNum Lit670;
    static final FString Lit671;
    static final FString Lit672;
    static final SimpleSymbol Lit673;
    static final IntNum Lit674 = IntNum.make(-1015);
    static final FString Lit675;
    static final FString Lit676;
    static final SimpleSymbol Lit677;
    static final IntNum Lit678 = IntNum.make(-1005);
    static final FString Lit679;
    static final SimpleSymbol Lit68;
    static final FString Lit680;
    static final FString Lit681;
    static final SimpleSymbol Lit682;
    static final SimpleSymbol Lit683;
    static final PairWithPosition Lit684 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6910176), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6910170);
    static final PairWithPosition Lit685 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6910206);
    static final SimpleSymbol Lit686;
    static final SimpleSymbol Lit687;
    static final FString Lit688;
    static final FString Lit689;
    static final IntNum Lit69;
    static final PairWithPosition Lit690 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6938850), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6938844);
    static final PairWithPosition Lit691 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6938880);
    static final SimpleSymbol Lit692;
    static final FString Lit693;
    static final FString Lit694;
    static final PairWithPosition Lit695 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6967518), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6967512);
    static final PairWithPosition Lit696 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6967548);
    static final SimpleSymbol Lit697;
    static final FString Lit698;
    static final FString Lit699;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final PairWithPosition Lit700 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6996192), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6996186);
    static final PairWithPosition Lit701 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 6996222);
    static final SimpleSymbol Lit702;
    static final FString Lit703;
    static final SimpleSymbol Lit704;
    static final SimpleSymbol Lit705;
    static final IntNum Lit706 = IntNum.make(5000);
    static final FString Lit707;
    static final PairWithPosition Lit708 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7033227), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7033221);
    static final PairWithPosition Lit709 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7033624), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7033618);
    static final IntNum Lit71;
    static final PairWithPosition Lit710 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7034008), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7034002);
    static final PairWithPosition Lit711 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7034393), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7034387);
    static final PairWithPosition Lit712 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7034783), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7034777);
    static final PairWithPosition Lit713 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7035174), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7035168);
    static final PairWithPosition Lit714 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7035569), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7035563);
    static final PairWithPosition Lit715 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7035965), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7035959);
    static final PairWithPosition Lit716 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7036357), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7036351);
    static final PairWithPosition Lit717 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7036750), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7036744);
    static final PairWithPosition Lit718 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7037139), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7037133);
    static final PairWithPosition Lit719 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7037529), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7037523);
    static final SimpleSymbol Lit72;
    static final PairWithPosition Lit720 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7037923), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7037917);
    static final PairWithPosition Lit721 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7038318), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7038312);
    static final PairWithPosition Lit722 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7038617), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7038611);
    static final PairWithPosition Lit723;
    static final SimpleSymbol Lit724;
    static final SimpleSymbol Lit725;
    static final FString Lit726;
    static final FString Lit727;
    static final PairWithPosition Lit728 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7061732), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7061726);
    static final PairWithPosition Lit729 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7061762);
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit730;
    static final FString Lit731;
    static final FString Lit732;
    static final PairWithPosition Lit733 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7090406), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7090400);
    static final PairWithPosition Lit734 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7090436);
    static final SimpleSymbol Lit735;
    static final FString Lit736;
    static final FString Lit737;
    static final PairWithPosition Lit738 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7119074), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7119068);
    static final PairWithPosition Lit739 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7119104);
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit740;
    static final FString Lit741;
    static final FString Lit742;
    static final PairWithPosition Lit743 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7147748), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7147742);
    static final PairWithPosition Lit744 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7147778);
    static final SimpleSymbol Lit745;
    static final FString Lit746;
    static final FString Lit747;
    static final PairWithPosition Lit748 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7176416), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7176410);
    static final PairWithPosition Lit749 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7176446);
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit750;
    static final FString Lit751;
    static final FString Lit752;
    static final PairWithPosition Lit753 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7205090), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7205084);
    static final PairWithPosition Lit754 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7205120);
    static final SimpleSymbol Lit755;
    static final FString Lit756;
    static final FString Lit757;
    static final PairWithPosition Lit758 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7233756), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7233750);
    static final PairWithPosition Lit759 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7233786);
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit760;
    static final FString Lit761;
    static final FString Lit762;
    static final PairWithPosition Lit763 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7262430), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7262424);
    static final PairWithPosition Lit764 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7262460);
    static final SimpleSymbol Lit765;
    static final FString Lit766;
    static final FString Lit767;
    static final PairWithPosition Lit768 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7291100), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7291094);
    static final PairWithPosition Lit769 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7291130);
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit770;
    static final FString Lit771;
    static final FString Lit772;
    static final PairWithPosition Lit773 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7319774), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7319768);
    static final PairWithPosition Lit774 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7319804);
    static final SimpleSymbol Lit775;
    static final FString Lit776;
    static final SimpleSymbol Lit777;
    static final FString Lit778;
    static final FString Lit779;
    static final SimpleSymbol Lit78;
    static final FString Lit780;
    static final PairWithPosition Lit781 = PairWithPosition.make(Lit804, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7368924), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7368918);
    static final PairWithPosition Lit782 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7368954);
    static final SimpleSymbol Lit783;
    static final FString Lit784;
    static final FString Lit785;
    static final PairWithPosition Lit786;
    static final PairWithPosition Lit787 = PairWithPosition.make(Lit803, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7397626);
    static final SimpleSymbol Lit788;
    static final SimpleSymbol Lit789;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit790;
    static final SimpleSymbol Lit791;
    static final SimpleSymbol Lit792;
    static final SimpleSymbol Lit793;
    static final SimpleSymbol Lit794;
    static final SimpleSymbol Lit795;
    static final SimpleSymbol Lit796;
    static final SimpleSymbol Lit797;
    static final SimpleSymbol Lit798;
    static final SimpleSymbol Lit799;
    static final PairWithPosition Lit8 = PairWithPosition.make(Lit54, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33575), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 33569);
    static final IntNum Lit80 = IntNum.make(1);
    static final SimpleSymbol Lit800;
    static final SimpleSymbol Lit801;
    static final SimpleSymbol Lit802;
    static final SimpleSymbol Lit803;
    static final SimpleSymbol Lit804;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final SimpleSymbol Lit86;
    static final IntNum Lit87 = IntNum.make(-2);
    static final SimpleSymbol Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final SimpleSymbol Lit91;
    static final SimpleSymbol Lit92;
    static final SimpleSymbol Lit93;
    static final IntNum Lit94 = IntNum.make(0);
    static final FString Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final IntNum Lit98;
    static final SimpleSymbol Lit99;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn100 = null;
    static final ModuleMethod lambda$Fn101 = null;
    static final ModuleMethod lambda$Fn102 = null;
    static final ModuleMethod lambda$Fn103 = null;
    static final ModuleMethod lambda$Fn104 = null;
    static final ModuleMethod lambda$Fn105 = null;
    static final ModuleMethod lambda$Fn106 = null;
    static final ModuleMethod lambda$Fn107 = null;
    static final ModuleMethod lambda$Fn108 = null;
    static final ModuleMethod lambda$Fn109 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn110 = null;
    static final ModuleMethod lambda$Fn111 = null;
    static final ModuleMethod lambda$Fn112 = null;
    static final ModuleMethod lambda$Fn113 = null;
    static final ModuleMethod lambda$Fn114 = null;
    static final ModuleMethod lambda$Fn115 = null;
    static final ModuleMethod lambda$Fn116 = null;
    static final ModuleMethod lambda$Fn117 = null;
    static final ModuleMethod lambda$Fn118 = null;
    static final ModuleMethod lambda$Fn119 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn120 = null;
    static final ModuleMethod lambda$Fn121 = null;
    static final ModuleMethod lambda$Fn122 = null;
    static final ModuleMethod lambda$Fn123 = null;
    static final ModuleMethod lambda$Fn124 = null;
    static final ModuleMethod lambda$Fn125 = null;
    static final ModuleMethod lambda$Fn126 = null;
    static final ModuleMethod lambda$Fn127 = null;
    static final ModuleMethod lambda$Fn128 = null;
    static final ModuleMethod lambda$Fn129 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn130 = null;
    static final ModuleMethod lambda$Fn131 = null;
    static final ModuleMethod lambda$Fn132 = null;
    static final ModuleMethod lambda$Fn133 = null;
    static final ModuleMethod lambda$Fn134 = null;
    static final ModuleMethod lambda$Fn135 = null;
    static final ModuleMethod lambda$Fn136 = null;
    static final ModuleMethod lambda$Fn137 = null;
    static final ModuleMethod lambda$Fn138 = null;
    static final ModuleMethod lambda$Fn139 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn140 = null;
    static final ModuleMethod lambda$Fn141 = null;
    static final ModuleMethod lambda$Fn142 = null;
    static final ModuleMethod lambda$Fn143 = null;
    static final ModuleMethod lambda$Fn144 = null;
    static final ModuleMethod lambda$Fn145 = null;
    static final ModuleMethod lambda$Fn146 = null;
    static final ModuleMethod lambda$Fn147 = null;
    static final ModuleMethod lambda$Fn148 = null;
    static final ModuleMethod lambda$Fn149 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn150 = null;
    static final ModuleMethod lambda$Fn151 = null;
    static final ModuleMethod lambda$Fn152 = null;
    static final ModuleMethod lambda$Fn153 = null;
    static final ModuleMethod lambda$Fn154 = null;
    static final ModuleMethod lambda$Fn155 = null;
    static final ModuleMethod lambda$Fn156 = null;
    static final ModuleMethod lambda$Fn157 = null;
    static final ModuleMethod lambda$Fn158 = null;
    static final ModuleMethod lambda$Fn159 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn160 = null;
    static final ModuleMethod lambda$Fn161 = null;
    static final ModuleMethod lambda$Fn162 = null;
    static final ModuleMethod lambda$Fn163 = null;
    static final ModuleMethod lambda$Fn164 = null;
    static final ModuleMethod lambda$Fn165 = null;
    static final ModuleMethod lambda$Fn166 = null;
    static final ModuleMethod lambda$Fn167 = null;
    static final ModuleMethod lambda$Fn168 = null;
    static final ModuleMethod lambda$Fn169 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn170 = null;
    static final ModuleMethod lambda$Fn171 = null;
    static final ModuleMethod lambda$Fn172 = null;
    static final ModuleMethod lambda$Fn173 = null;
    static final ModuleMethod lambda$Fn174 = null;
    static final ModuleMethod lambda$Fn175 = null;
    static final ModuleMethod lambda$Fn176 = null;
    static final ModuleMethod lambda$Fn177 = null;
    static final ModuleMethod lambda$Fn178 = null;
    static final ModuleMethod lambda$Fn179 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn180 = null;
    static final ModuleMethod lambda$Fn181 = null;
    static final ModuleMethod lambda$Fn182 = null;
    static final ModuleMethod lambda$Fn183 = null;
    static final ModuleMethod lambda$Fn184 = null;
    static final ModuleMethod lambda$Fn185 = null;
    static final ModuleMethod lambda$Fn186 = null;
    static final ModuleMethod lambda$Fn187 = null;
    static final ModuleMethod lambda$Fn188 = null;
    static final ModuleMethod lambda$Fn189 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn190 = null;
    static final ModuleMethod lambda$Fn191 = null;
    static final ModuleMethod lambda$Fn192 = null;
    static final ModuleMethod lambda$Fn193 = null;
    static final ModuleMethod lambda$Fn194 = null;
    static final ModuleMethod lambda$Fn195 = null;
    static final ModuleMethod lambda$Fn196 = null;
    static final ModuleMethod lambda$Fn197 = null;
    static final ModuleMethod lambda$Fn198 = null;
    static final ModuleMethod lambda$Fn199 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn200 = null;
    static final ModuleMethod lambda$Fn201 = null;
    static final ModuleMethod lambda$Fn202 = null;
    static final ModuleMethod lambda$Fn203 = null;
    static final ModuleMethod lambda$Fn204 = null;
    static final ModuleMethod lambda$Fn205 = null;
    static final ModuleMethod lambda$Fn206 = null;
    static final ModuleMethod lambda$Fn207 = null;
    static final ModuleMethod lambda$Fn208 = null;
    static final ModuleMethod lambda$Fn209 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn210 = null;
    static final ModuleMethod lambda$Fn211 = null;
    static final ModuleMethod lambda$Fn212 = null;
    static final ModuleMethod lambda$Fn213 = null;
    static final ModuleMethod lambda$Fn214 = null;
    static final ModuleMethod lambda$Fn215 = null;
    static final ModuleMethod lambda$Fn216 = null;
    static final ModuleMethod lambda$Fn217 = null;
    static final ModuleMethod lambda$Fn218 = null;
    static final ModuleMethod lambda$Fn219 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn220 = null;
    static final ModuleMethod lambda$Fn221 = null;
    static final ModuleMethod lambda$Fn222 = null;
    static final ModuleMethod lambda$Fn223 = null;
    static final ModuleMethod lambda$Fn224 = null;
    static final ModuleMethod lambda$Fn225 = null;
    static final ModuleMethod lambda$Fn226 = null;
    static final ModuleMethod lambda$Fn227 = null;
    static final ModuleMethod lambda$Fn228 = null;
    static final ModuleMethod lambda$Fn229 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn230 = null;
    static final ModuleMethod lambda$Fn231 = null;
    static final ModuleMethod lambda$Fn232 = null;
    static final ModuleMethod lambda$Fn233 = null;
    static final ModuleMethod lambda$Fn234 = null;
    static final ModuleMethod lambda$Fn235 = null;
    static final ModuleMethod lambda$Fn236 = null;
    static final ModuleMethod lambda$Fn237 = null;
    static final ModuleMethod lambda$Fn238 = null;
    static final ModuleMethod lambda$Fn239 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn240 = null;
    static final ModuleMethod lambda$Fn241 = null;
    static final ModuleMethod lambda$Fn242 = null;
    static final ModuleMethod lambda$Fn243 = null;
    static final ModuleMethod lambda$Fn244 = null;
    static final ModuleMethod lambda$Fn245 = null;
    static final ModuleMethod lambda$Fn246 = null;
    static final ModuleMethod lambda$Fn247 = null;
    static final ModuleMethod lambda$Fn248 = null;
    static final ModuleMethod lambda$Fn249 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn250 = null;
    static final ModuleMethod lambda$Fn251 = null;
    static final ModuleMethod lambda$Fn252 = null;
    static final ModuleMethod lambda$Fn253 = null;
    static final ModuleMethod lambda$Fn254 = null;
    static final ModuleMethod lambda$Fn255 = null;
    static final ModuleMethod lambda$Fn256 = null;
    static final ModuleMethod lambda$Fn257 = null;
    static final ModuleMethod lambda$Fn258 = null;
    static final ModuleMethod lambda$Fn259 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn260 = null;
    static final ModuleMethod lambda$Fn261 = null;
    static final ModuleMethod lambda$Fn262 = null;
    static final ModuleMethod lambda$Fn263 = null;
    static final ModuleMethod lambda$Fn264 = null;
    static final ModuleMethod lambda$Fn265 = null;
    static final ModuleMethod lambda$Fn266 = null;
    static final ModuleMethod lambda$Fn267 = null;
    static final ModuleMethod lambda$Fn268 = null;
    static final ModuleMethod lambda$Fn269 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn270 = null;
    static final ModuleMethod lambda$Fn271 = null;
    static final ModuleMethod lambda$Fn272 = null;
    static final ModuleMethod lambda$Fn273 = null;
    static final ModuleMethod lambda$Fn274 = null;
    static final ModuleMethod lambda$Fn275 = null;
    static final ModuleMethod lambda$Fn276 = null;
    static final ModuleMethod lambda$Fn277 = null;
    static final ModuleMethod lambda$Fn278 = null;
    static final ModuleMethod lambda$Fn279 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn280 = null;
    static final ModuleMethod lambda$Fn281 = null;
    static final ModuleMethod lambda$Fn282 = null;
    static final ModuleMethod lambda$Fn283 = null;
    static final ModuleMethod lambda$Fn284 = null;
    static final ModuleMethod lambda$Fn285 = null;
    static final ModuleMethod lambda$Fn286 = null;
    static final ModuleMethod lambda$Fn287 = null;
    static final ModuleMethod lambda$Fn288 = null;
    static final ModuleMethod lambda$Fn289 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn290 = null;
    static final ModuleMethod lambda$Fn291 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn79 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn80 = null;
    static final ModuleMethod lambda$Fn81 = null;
    static final ModuleMethod lambda$Fn82 = null;
    static final ModuleMethod lambda$Fn83 = null;
    static final ModuleMethod lambda$Fn84 = null;
    static final ModuleMethod lambda$Fn85 = null;
    static final ModuleMethod lambda$Fn86 = null;
    static final ModuleMethod lambda$Fn87 = null;
    static final ModuleMethod lambda$Fn88 = null;
    static final ModuleMethod lambda$Fn89 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod lambda$Fn90 = null;
    static final ModuleMethod lambda$Fn91 = null;
    static final ModuleMethod lambda$Fn92 = null;
    static final ModuleMethod lambda$Fn93 = null;
    static final ModuleMethod lambda$Fn94 = null;
    static final ModuleMethod lambda$Fn95 = null;
    static final ModuleMethod lambda$Fn96 = null;
    static final ModuleMethod lambda$Fn97 = null;
    static final ModuleMethod lambda$Fn98 = null;
    static final ModuleMethod lambda$Fn99 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public MakeroidBottomSheet Alt_Tabaka1;
    public Label BtcAlis;
    public Label CanadaAlis;
    public Label CanadaSatis;
    public MakeroidCardView Card_View1;
    public final ModuleMethod Card_View1$Click;
    public MakeroidCardView Card_View1_copy;
    public final ModuleMethod Card_View1_copy$Click;
    public MakeroidCardView Card_View1_copy_copy;
    public final ModuleMethod Card_View1_copy_copy$Click;
    public MakeroidCardView Card_View1_copy_copy_copy;
    public final ModuleMethod Card_View1_copy_copy_copy$Click;
    public MakeroidCardView Card_View1_copy_copy_copy_copy;
    public final ModuleMethod Card_View1_copy_copy_copy_copy$Click;
    public MakeroidCardView Card_View1_copy_copy_copy_copy_copy;
    public final ModuleMethod Card_View1_copy_copy_copy_copy_copy$Click;
    public MakeroidCardView Card_View1_copy_copy_copy_copy_copy_copy;
    public final ModuleMethod Card_View1_copy_copy_copy_copy_copy_copy$Click;
    public MakeroidCardView Card_View1_copy_copy_copy_copy_copy_copy_copy;
    public final ModuleMethod Card_View1_copy_copy_copy_copy_copy_copy_copy$Click;
    public MakeroidCardView Card_View1_copy_copy_copy_copy_copy_copy_copy_copy;
    public final ModuleMethod Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Label DolarAlis;
    public Label DolarSatis;
    public Label EthAlis;
    public Label EuroAlis;
    public Label EuroSatis;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement1_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement2_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy_copy;
    public HorizontalArrangement Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy_copy_copy;
    public Image Image1;
    public Label JpyAlis;
    public Label JpySatis;
    public Label Label1;
    public Label Label1_copy;
    public Label Label1_copy_copy;
    public Label Label1_copy_copy_copy;
    public Label Label1_copy_copy_copy_copy;
    public Label Label1_copy_copy_copy_copy_copy;
    public Label Label1_copy_copy_copy_copy_copy_copy;
    public Label Label1_copy_copy_copy_copy_copy_copy_copy;
    public Label Label1_copy_copy_copy_copy_copy_copy_copy_copy;
    public Label Label2;
    public Label Label2_copy;
    public Label Label2_copy_copy;
    public Label Label2_copy_copy_copy;
    public Label Label2_copy_copy_copy_copy;
    public Label Label2_copy_copy_copy_copy_copy;
    public Label Label2_copy_copy_copy_copy_copy_copy;
    public Label Label2_copy_copy_copy_copy_copy_copy_copy;
    public Label Label2_copy_copy_copy_copy_copy_copy_copy_copy;
    public Label Label3;
    public Label Label3_copy;
    public Label Label3_copy_copy_copy;
    public Label Label3_copy_copy_copy_copy;
    public Label Label3_copy_copy_copy_copy_copy;
    public Label Label3_copy_copy_copy_copy_copy_copy;
    public Label Label3_copy_copy_copy_copy_copy_copy_copy;
    public Label Label3_copy_copy_copy_copy_copy_copy_copy_copy;
    public Label Label4;
    public Label Label4_copy;
    public Label Label4_copy_copy;
    public Label Label4_copy_copy_copy;
    public Label Label4_copy_copy_copy_copy;
    public Label Label4_copy_copy_copy_copy_copy;
    public Label Label4_copy_copy_copy_copy_copy_copy;
    public Label Label4_copy_copy_copy_copy_copy_copy_copy;
    public Label Label4_copy_copy_copy_copy_copy_copy_copy_copy;
    public Label Label6;
    public Label Label6_copy;
    public Label Label6_copy_copy;
    public Label Label6_copy_copy_copy;
    public Label Label6_copy_copy_copy_copy;
    public Label Label6_copy_copy_copy_copy_copy;
    public Label Label6_copy_copy_copy_copy_copy_copy;
    public Label RubleAlis;
    public Label RubleSatis;
    public final ModuleMethod Screen1$Initialize;
    public SpaceView Space1;
    public SpaceView Space1_copy;
    public SpaceView Space1_copy_copy;
    public SpaceView Space1_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy_copy_copy_copy_copy;
    public SpaceView Space1_copy_copy_copy_copy_copy_copy_copy_copy;
    public SpaceView Space2;
    public SpaceView Space2_copy;
    public SpaceView Space2_copy_copy;
    public SpaceView Space2_copy_copy_copy;
    public SpaceView Space2_copy_copy_copy_copy;
    public SpaceView Space2_copy_copy_copy_copy_copy;
    public SpaceView Space2_copy_copy_copy_copy_copy_copy;
    public SpaceView Space2_copy_copy_copy_copy_copy_copy_copy;
    public SpaceView Space2_copy_copy_copy_copy_copy_copy_copy_copy;
    public SpaceView Space3;
    public SpaceView Space3_copy;
    public SpaceView Space3_copy_copy;
    public SpaceView Space3_copy_copy_copy;
    public SpaceView Space3_copy_copy_copy_copy;
    public SpaceView Space3_copy_copy_copy_copy_copy;
    public SpaceView Space3_copy_copy_copy_copy_copy_copy;
    public SpaceView Space3_copy_copy_copy_copy_copy_copy_copy;
    public SpaceView Space3_copy_copy_copy_copy_copy_copy_copy_copy;
    public SpaceView Space4;
    public SpaceView Space4_copy;
    public Label SterlinAlis;
    public Label SterlinSatis;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement1_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement1_copy_copy_copy_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement2_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement3_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy_copy_copy_copy_copy_copy;
    public VerticalArrangement Vertical_Arrangement3_copy_copy_copy_copy_copy_copy_copy_copy;
    public VerticalScrollArrangement Vertical_Scroll_Arrangement1;
    public Label WonAlis;
    public Label WonSatis;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public C1289WebScrapper btcAlis;
    public final ModuleMethod btcAlis$GotElements;
    public C1289WebScrapper canadaAlis;
    public final ModuleMethod canadaAlis$GotElements;
    public C1289WebScrapper canadaSatis;
    public final ModuleMethod canadaSatis$GotElements;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public C1289WebScrapper dolarAlis;
    public final ModuleMethod dolarAlis$GotElements;
    public C1289WebScrapper dolarSatis;
    public final ModuleMethod dolarSatis$GotElements;
    public C1289WebScrapper ethAlis;
    public final ModuleMethod ethAlis$GotElements;
    public C1289WebScrapper euroAlis;
    public final ModuleMethod euroAlis$GotElements;
    public C1289WebScrapper euroSatis;
    public final ModuleMethod euroSatis$GotElements;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public C1289WebScrapper jpyAlis;
    public final ModuleMethod jpyAlis$GotElements;
    public C1289WebScrapper jpySatis;
    public final ModuleMethod jpySatis$GotElements;
    public Label labelll;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public C1289WebScrapper rubleAlis;
    public final ModuleMethod rubleAlis$GotElements;
    public C1289WebScrapper rubleSatis;
    public final ModuleMethod rubleSatis$GotElements;
    public final ModuleMethod send$Mnerror;
    public C1289WebScrapper sterlinAlis;
    public final ModuleMethod sterlinAlis$GotElements;
    public C1289WebScrapper sterlinSatis;
    public final ModuleMethod sterlinSatis$GotElements;
    public C1289WebScrapper wonAlis;
    public final ModuleMethod wonAlis$GotElements;
    public C1289WebScrapper wonSatis;
    public final ModuleMethod wonSatis$GotElements;

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
        FString fString3;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol20;
        FString fString6;
        SimpleSymbol simpleSymbol21;
        FString fString7;
        FString fString8;
        SimpleSymbol simpleSymbol22;
        FString fString9;
        FString fString10;
        SimpleSymbol simpleSymbol23;
        FString fString11;
        FString fString12;
        SimpleSymbol simpleSymbol24;
        FString fString13;
        FString fString14;
        SimpleSymbol simpleSymbol25;
        FString fString15;
        FString fString16;
        SimpleSymbol simpleSymbol26;
        FString fString17;
        FString fString18;
        SimpleSymbol simpleSymbol27;
        FString fString19;
        FString fString20;
        SimpleSymbol simpleSymbol28;
        FString fString21;
        FString fString22;
        SimpleSymbol simpleSymbol29;
        FString fString23;
        FString fString24;
        SimpleSymbol simpleSymbol30;
        FString fString25;
        FString fString26;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        SimpleSymbol simpleSymbol33;
        FString fString27;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        FString fString28;
        SimpleSymbol simpleSymbol36;
        FString fString29;
        FString fString30;
        SimpleSymbol simpleSymbol37;
        FString fString31;
        FString fString32;
        SimpleSymbol simpleSymbol38;
        FString fString33;
        FString fString34;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        FString fString35;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol43;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol44;
        FString fString40;
        FString fString41;
        SimpleSymbol simpleSymbol45;
        FString fString42;
        FString fString43;
        SimpleSymbol simpleSymbol46;
        FString fString44;
        FString fString45;
        SimpleSymbol simpleSymbol47;
        FString fString46;
        FString fString47;
        SimpleSymbol simpleSymbol48;
        FString fString48;
        FString fString49;
        SimpleSymbol simpleSymbol49;
        FString fString50;
        FString fString51;
        SimpleSymbol simpleSymbol50;
        FString fString52;
        FString fString53;
        SimpleSymbol simpleSymbol51;
        FString fString54;
        FString fString55;
        SimpleSymbol simpleSymbol52;
        FString fString56;
        FString fString57;
        SimpleSymbol simpleSymbol53;
        FString fString58;
        FString fString59;
        SimpleSymbol simpleSymbol54;
        FString fString60;
        FString fString61;
        SimpleSymbol simpleSymbol55;
        FString fString62;
        SimpleSymbol simpleSymbol56;
        FString fString63;
        SimpleSymbol simpleSymbol57;
        FString fString64;
        FString fString65;
        SimpleSymbol simpleSymbol58;
        FString fString66;
        FString fString67;
        SimpleSymbol simpleSymbol59;
        FString fString68;
        FString fString69;
        SimpleSymbol simpleSymbol60;
        FString fString70;
        FString fString71;
        SimpleSymbol simpleSymbol61;
        FString fString72;
        FString fString73;
        SimpleSymbol simpleSymbol62;
        FString fString74;
        FString fString75;
        SimpleSymbol simpleSymbol63;
        FString fString76;
        FString fString77;
        SimpleSymbol simpleSymbol64;
        FString fString78;
        FString fString79;
        SimpleSymbol simpleSymbol65;
        FString fString80;
        FString fString81;
        SimpleSymbol simpleSymbol66;
        FString fString82;
        FString fString83;
        SimpleSymbol simpleSymbol67;
        FString fString84;
        FString fString85;
        SimpleSymbol simpleSymbol68;
        FString fString86;
        FString fString87;
        SimpleSymbol simpleSymbol69;
        FString fString88;
        FString fString89;
        SimpleSymbol simpleSymbol70;
        FString fString90;
        SimpleSymbol simpleSymbol71;
        FString fString91;
        SimpleSymbol simpleSymbol72;
        FString fString92;
        FString fString93;
        SimpleSymbol simpleSymbol73;
        FString fString94;
        FString fString95;
        SimpleSymbol simpleSymbol74;
        FString fString96;
        FString fString97;
        SimpleSymbol simpleSymbol75;
        FString fString98;
        FString fString99;
        SimpleSymbol simpleSymbol76;
        FString fString100;
        FString fString101;
        SimpleSymbol simpleSymbol77;
        FString fString102;
        FString fString103;
        SimpleSymbol simpleSymbol78;
        FString fString104;
        FString fString105;
        SimpleSymbol simpleSymbol79;
        FString fString106;
        FString fString107;
        SimpleSymbol simpleSymbol80;
        FString fString108;
        FString fString109;
        SimpleSymbol simpleSymbol81;
        FString fString110;
        FString fString111;
        SimpleSymbol simpleSymbol82;
        FString fString112;
        FString fString113;
        SimpleSymbol simpleSymbol83;
        FString fString114;
        FString fString115;
        SimpleSymbol simpleSymbol84;
        FString fString116;
        FString fString117;
        SimpleSymbol simpleSymbol85;
        SimpleSymbol simpleSymbol86;
        FString fString118;
        FString fString119;
        SimpleSymbol simpleSymbol87;
        FString fString120;
        FString fString121;
        SimpleSymbol simpleSymbol88;
        FString fString122;
        SimpleSymbol simpleSymbol89;
        FString fString123;
        SimpleSymbol simpleSymbol90;
        FString fString124;
        FString fString125;
        SimpleSymbol simpleSymbol91;
        FString fString126;
        FString fString127;
        SimpleSymbol simpleSymbol92;
        FString fString128;
        FString fString129;
        SimpleSymbol simpleSymbol93;
        FString fString130;
        FString fString131;
        SimpleSymbol simpleSymbol94;
        FString fString132;
        FString fString133;
        SimpleSymbol simpleSymbol95;
        FString fString134;
        FString fString135;
        SimpleSymbol simpleSymbol96;
        FString fString136;
        FString fString137;
        SimpleSymbol simpleSymbol97;
        FString fString138;
        FString fString139;
        SimpleSymbol simpleSymbol98;
        FString fString140;
        FString fString141;
        SimpleSymbol simpleSymbol99;
        FString fString142;
        FString fString143;
        SimpleSymbol simpleSymbol100;
        FString fString144;
        FString fString145;
        SimpleSymbol simpleSymbol101;
        FString fString146;
        FString fString147;
        SimpleSymbol simpleSymbol102;
        FString fString148;
        FString fString149;
        SimpleSymbol simpleSymbol103;
        FString fString150;
        FString fString151;
        SimpleSymbol simpleSymbol104;
        FString fString152;
        FString fString153;
        SimpleSymbol simpleSymbol105;
        FString fString154;
        SimpleSymbol simpleSymbol106;
        FString fString155;
        SimpleSymbol simpleSymbol107;
        FString fString156;
        FString fString157;
        SimpleSymbol simpleSymbol108;
        FString fString158;
        FString fString159;
        SimpleSymbol simpleSymbol109;
        FString fString160;
        FString fString161;
        SimpleSymbol simpleSymbol110;
        FString fString162;
        FString fString163;
        SimpleSymbol simpleSymbol111;
        FString fString164;
        FString fString165;
        SimpleSymbol simpleSymbol112;
        FString fString166;
        FString fString167;
        SimpleSymbol simpleSymbol113;
        FString fString168;
        FString fString169;
        SimpleSymbol simpleSymbol114;
        FString fString170;
        FString fString171;
        SimpleSymbol simpleSymbol115;
        FString fString172;
        FString fString173;
        SimpleSymbol simpleSymbol116;
        FString fString174;
        FString fString175;
        SimpleSymbol simpleSymbol117;
        FString fString176;
        FString fString177;
        SimpleSymbol simpleSymbol118;
        FString fString178;
        FString fString179;
        SimpleSymbol simpleSymbol119;
        FString fString180;
        FString fString181;
        SimpleSymbol simpleSymbol120;
        FString fString182;
        FString fString183;
        SimpleSymbol simpleSymbol121;
        FString fString184;
        FString fString185;
        SimpleSymbol simpleSymbol122;
        FString fString186;
        SimpleSymbol simpleSymbol123;
        FString fString187;
        SimpleSymbol simpleSymbol124;
        FString fString188;
        FString fString189;
        SimpleSymbol simpleSymbol125;
        FString fString190;
        FString fString191;
        SimpleSymbol simpleSymbol126;
        FString fString192;
        FString fString193;
        SimpleSymbol simpleSymbol127;
        FString fString194;
        FString fString195;
        SimpleSymbol simpleSymbol128;
        FString fString196;
        FString fString197;
        SimpleSymbol simpleSymbol129;
        FString fString198;
        FString fString199;
        SimpleSymbol simpleSymbol130;
        FString fString200;
        FString fString201;
        SimpleSymbol simpleSymbol131;
        FString fString202;
        FString fString203;
        SimpleSymbol simpleSymbol132;
        FString fString204;
        FString fString205;
        SimpleSymbol simpleSymbol133;
        FString fString206;
        FString fString207;
        SimpleSymbol simpleSymbol134;
        FString fString208;
        FString fString209;
        SimpleSymbol simpleSymbol135;
        FString fString210;
        FString fString211;
        SimpleSymbol simpleSymbol136;
        FString fString212;
        FString fString213;
        SimpleSymbol simpleSymbol137;
        FString fString214;
        FString fString215;
        SimpleSymbol simpleSymbol138;
        FString fString216;
        FString fString217;
        SimpleSymbol simpleSymbol139;
        FString fString218;
        SimpleSymbol simpleSymbol140;
        FString fString219;
        SimpleSymbol simpleSymbol141;
        FString fString220;
        FString fString221;
        SimpleSymbol simpleSymbol142;
        FString fString222;
        FString fString223;
        SimpleSymbol simpleSymbol143;
        FString fString224;
        FString fString225;
        SimpleSymbol simpleSymbol144;
        FString fString226;
        FString fString227;
        SimpleSymbol simpleSymbol145;
        FString fString228;
        FString fString229;
        SimpleSymbol simpleSymbol146;
        FString fString230;
        FString fString231;
        SimpleSymbol simpleSymbol147;
        FString fString232;
        FString fString233;
        SimpleSymbol simpleSymbol148;
        FString fString234;
        FString fString235;
        SimpleSymbol simpleSymbol149;
        FString fString236;
        FString fString237;
        SimpleSymbol simpleSymbol150;
        FString fString238;
        FString fString239;
        SimpleSymbol simpleSymbol151;
        FString fString240;
        FString fString241;
        SimpleSymbol simpleSymbol152;
        FString fString242;
        FString fString243;
        SimpleSymbol simpleSymbol153;
        FString fString244;
        FString fString245;
        SimpleSymbol simpleSymbol154;
        FString fString246;
        FString fString247;
        SimpleSymbol simpleSymbol155;
        FString fString248;
        FString fString249;
        SimpleSymbol simpleSymbol156;
        FString fString250;
        SimpleSymbol simpleSymbol157;
        FString fString251;
        SimpleSymbol simpleSymbol158;
        FString fString252;
        FString fString253;
        SimpleSymbol simpleSymbol159;
        FString fString254;
        FString fString255;
        SimpleSymbol simpleSymbol160;
        FString fString256;
        FString fString257;
        SimpleSymbol simpleSymbol161;
        FString fString258;
        FString fString259;
        SimpleSymbol simpleSymbol162;
        FString fString260;
        FString fString261;
        SimpleSymbol simpleSymbol163;
        FString fString262;
        FString fString263;
        SimpleSymbol simpleSymbol164;
        FString fString264;
        FString fString265;
        SimpleSymbol simpleSymbol165;
        FString fString266;
        FString fString267;
        SimpleSymbol simpleSymbol166;
        FString fString268;
        FString fString269;
        SimpleSymbol simpleSymbol167;
        FString fString270;
        FString fString271;
        SimpleSymbol simpleSymbol168;
        FString fString272;
        FString fString273;
        SimpleSymbol simpleSymbol169;
        FString fString274;
        FString fString275;
        SimpleSymbol simpleSymbol170;
        FString fString276;
        FString fString277;
        SimpleSymbol simpleSymbol171;
        FString fString278;
        FString fString279;
        SimpleSymbol simpleSymbol172;
        FString fString280;
        FString fString281;
        SimpleSymbol simpleSymbol173;
        FString fString282;
        SimpleSymbol simpleSymbol174;
        FString fString283;
        SimpleSymbol simpleSymbol175;
        FString fString284;
        FString fString285;
        SimpleSymbol simpleSymbol176;
        FString fString286;
        FString fString287;
        SimpleSymbol simpleSymbol177;
        FString fString288;
        FString fString289;
        SimpleSymbol simpleSymbol178;
        FString fString290;
        FString fString291;
        SimpleSymbol simpleSymbol179;
        FString fString292;
        FString fString293;
        SimpleSymbol simpleSymbol180;
        FString fString294;
        FString fString295;
        SimpleSymbol simpleSymbol181;
        FString fString296;
        FString fString297;
        SimpleSymbol simpleSymbol182;
        FString fString298;
        FString fString299;
        SimpleSymbol simpleSymbol183;
        FString fString300;
        FString fString301;
        SimpleSymbol simpleSymbol184;
        SimpleSymbol simpleSymbol185;
        FString fString302;
        FString fString303;
        SimpleSymbol simpleSymbol186;
        FString fString304;
        FString fString305;
        SimpleSymbol simpleSymbol187;
        FString fString306;
        FString fString307;
        SimpleSymbol simpleSymbol188;
        FString fString308;
        FString fString309;
        SimpleSymbol simpleSymbol189;
        SimpleSymbol simpleSymbol190;
        SimpleSymbol simpleSymbol191;
        SimpleSymbol simpleSymbol192;
        SimpleSymbol simpleSymbol193;
        SimpleSymbol simpleSymbol194;
        FString fString310;
        FString fString311;
        SimpleSymbol simpleSymbol195;
        FString fString312;
        FString fString313;
        SimpleSymbol simpleSymbol196;
        FString fString314;
        SimpleSymbol simpleSymbol197;
        SimpleSymbol simpleSymbol198;
        FString fString315;
        SimpleSymbol simpleSymbol199;
        SimpleSymbol simpleSymbol200;
        SimpleSymbol simpleSymbol201;
        SimpleSymbol simpleSymbol202;
        SimpleSymbol simpleSymbol203;
        SimpleSymbol simpleSymbol204;
        SimpleSymbol simpleSymbol205;
        SimpleSymbol simpleSymbol206;
        FString fString316;
        FString fString317;
        SimpleSymbol simpleSymbol207;
        SimpleSymbol simpleSymbol208;
        SimpleSymbol simpleSymbol209;
        FString fString318;
        FString fString319;
        SimpleSymbol simpleSymbol210;
        SimpleSymbol simpleSymbol211;
        SimpleSymbol simpleSymbol212;
        FString fString320;
        SimpleSymbol simpleSymbol213;
        SimpleSymbol simpleSymbol214;
        SimpleSymbol simpleSymbol215;
        SimpleSymbol simpleSymbol216;
        SimpleSymbol simpleSymbol217;
        SimpleSymbol simpleSymbol218;
        SimpleSymbol simpleSymbol219;
        SimpleSymbol simpleSymbol220;
        SimpleSymbol simpleSymbol221;
        SimpleSymbol simpleSymbol222;
        SimpleSymbol simpleSymbol223;
        SimpleSymbol simpleSymbol224;
        SimpleSymbol simpleSymbol225;
        SimpleSymbol simpleSymbol226;
        SimpleSymbol simpleSymbol227;
        SimpleSymbol simpleSymbol228;
        SimpleSymbol simpleSymbol229;
        SimpleSymbol simpleSymbol230;
        SimpleSymbol simpleSymbol231;
        SimpleSymbol simpleSymbol232;
        SimpleSymbol simpleSymbol233;
        SimpleSymbol simpleSymbol234;
        SimpleSymbol simpleSymbol235;
        SimpleSymbol simpleSymbol236;
        SimpleSymbol simpleSymbol237;
        SimpleSymbol simpleSymbol238;
        SimpleSymbol simpleSymbol239;
        SimpleSymbol simpleSymbol240;
        SimpleSymbol simpleSymbol241;
        SimpleSymbol simpleSymbol242;
        SimpleSymbol simpleSymbol243;
        SimpleSymbol simpleSymbol244;
        SimpleSymbol simpleSymbol245;
        SimpleSymbol simpleSymbol246;
        SimpleSymbol simpleSymbol247;
        SimpleSymbol simpleSymbol248;
        SimpleSymbol simpleSymbol249;
        SimpleSymbol simpleSymbol250;
        SimpleSymbol simpleSymbol251;
        SimpleSymbol simpleSymbol252;
        SimpleSymbol simpleSymbol253;
        SimpleSymbol simpleSymbol254;
        new SimpleSymbol("list");
        Lit804 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("any");
        Lit803 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("lookup-handler");
        Lit802 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit801 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit800 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("send-error");
        Lit799 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit798 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit797 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-components");
        Lit796 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("add-to-events");
        Lit795 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit794 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit793 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit792 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit791 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("android-log-form");
        Lit790 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit789 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol("ethAlis$GotElements");
        Lit788 = (SimpleSymbol) simpleSymbol17.readResolve();
        SimpleSymbol simpleSymbol255 = Lit804;
        new SimpleSymbol("number");
        SimpleSymbol simpleSymbol256 = (SimpleSymbol) simpleSymbol18.readResolve();
        Lit57 = simpleSymbol256;
        Lit786 = PairWithPosition.make(simpleSymbol255, PairWithPosition.make(simpleSymbol256, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7397596), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7397590);
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit785 = fString;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit784 = fString2;
        new SimpleSymbol("btcAlis$GotElements");
        Lit783 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit780 = fString3;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit779 = fString4;
        new FString("com.google.appinventor.components.runtime.MakeroidBottomSheet");
        Lit778 = fString5;
        new SimpleSymbol("Alt_Tabaka1");
        Lit777 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidBottomSheet");
        Lit776 = fString6;
        new SimpleSymbol("wonSatis$GotElements");
        Lit775 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit772 = fString7;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit771 = fString8;
        new SimpleSymbol("wonAlis$GotElements");
        Lit770 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit767 = fString9;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit766 = fString10;
        new SimpleSymbol("jpySatis$GotElements");
        Lit765 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit762 = fString11;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit761 = fString12;
        new SimpleSymbol("jpyAlis$GotElements");
        Lit760 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit757 = fString13;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit756 = fString14;
        new SimpleSymbol("rubleSatis$GotElements");
        Lit755 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit752 = fString15;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit751 = fString16;
        new SimpleSymbol("rubleAlis$GotElements");
        Lit750 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit747 = fString17;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit746 = fString18;
        new SimpleSymbol("canadaSatis$GotElements");
        Lit745 = (SimpleSymbol) simpleSymbol27.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit742 = fString19;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit741 = fString20;
        new SimpleSymbol("canadaAlis$GotElements");
        Lit740 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit737 = fString21;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit736 = fString22;
        new SimpleSymbol("sterlinSatis$GotElements");
        Lit735 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit732 = fString23;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit731 = fString24;
        new SimpleSymbol("sterlinAlis$GotElements");
        Lit730 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit727 = fString25;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit726 = fString26;
        new SimpleSymbol("Timer");
        Lit725 = (SimpleSymbol) simpleSymbol31.readResolve();
        new SimpleSymbol("Clock1$Timer");
        Lit724 = (SimpleSymbol) simpleSymbol32.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol257 = (SimpleSymbol) simpleSymbol33.readResolve();
        Lit54 = simpleSymbol257;
        Lit723 = PairWithPosition.make(simpleSymbol257, PairWithPosition.make(Lit54, LList.Empty, "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7038917), "/tmp/1654197777675_0.7096698362885978-0/youngandroidproject/../src/io/kodular/cenkertrgut/dovizcevirici/Screen1.yail", 7038911);
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit707 = fString27;
        new SimpleSymbol("TimerInterval");
        Lit705 = (SimpleSymbol) simpleSymbol34.readResolve();
        new SimpleSymbol("Clock1");
        Lit704 = (SimpleSymbol) simpleSymbol35.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit703 = fString28;
        new SimpleSymbol("euroSatis$GotElements");
        Lit702 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit699 = fString29;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit698 = fString30;
        new SimpleSymbol("euroAlis$GotElements");
        Lit697 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit694 = fString31;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit693 = fString32;
        new SimpleSymbol("dolarSatis$GotElements");
        Lit692 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit689 = fString33;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit688 = fString34;
        new SimpleSymbol("GotElements");
        Lit687 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol("dolarAlis$GotElements");
        Lit686 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("$elements");
        Lit683 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("GetTextFromSingleElement");
        Lit682 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit681 = fString35;
        new FString("com.henry.WebScrapper.WebScrapper");
        Lit680 = fString36;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit679 = fString37;
        new SimpleSymbol("Space2_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit677 = (SimpleSymbol) simpleSymbol43.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit676 = fString38;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit675 = fString39;
        new SimpleSymbol("Space4_copy");
        Lit673 = (SimpleSymbol) simpleSymbol44.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit672 = fString40;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit671 = fString41;
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit670 = IntNum.make(iArr);
        new SimpleSymbol("EthAlis");
        Lit669 = (SimpleSymbol) simpleSymbol45.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit668 = fString42;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit667 = fString43;
        int[] iArr2 = new int[2];
        iArr2[0] = -1661076485;
        Lit666 = IntNum.make(iArr2);
        new SimpleSymbol("Label4_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit665 = (SimpleSymbol) simpleSymbol46.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit664 = fString44;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit663 = fString45;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit662 = (SimpleSymbol) simpleSymbol47.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit661 = fString46;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit660 = fString47;
        int[] iArr3 = new int[2];
        iArr3[0] = -1661076485;
        Lit659 = IntNum.make(iArr3);
        new SimpleSymbol("Label3_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit658 = (SimpleSymbol) simpleSymbol48.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit657 = fString48;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit656 = fString49;
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit655 = IntNum.make(iArr4);
        new SimpleSymbol("Label2_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit654 = (SimpleSymbol) simpleSymbol49.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit653 = fString50;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit652 = fString51;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit651 = (SimpleSymbol) simpleSymbol50.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit650 = fString52;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit649 = fString53;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit648 = (SimpleSymbol) simpleSymbol51.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit647 = fString54;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit646 = fString55;
        new SimpleSymbol("Space3_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit644 = (SimpleSymbol) simpleSymbol52.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit643 = fString56;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit642 = fString57;
        int[] iArr5 = new int[2];
        iArr5[0] = -6381922;
        Lit641 = IntNum.make(iArr5);
        new SimpleSymbol("Label1_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit640 = (SimpleSymbol) simpleSymbol53.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit639 = fString58;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit638 = fString59;
        new SimpleSymbol("Space1_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit636 = (SimpleSymbol) simpleSymbol54.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit635 = fString60;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit634 = fString61;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit633 = (SimpleSymbol) simpleSymbol55.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit632 = fString62;
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click");
        Lit631 = (SimpleSymbol) simpleSymbol56.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit629 = fString63;
        int[] iArr6 = new int[2];
        iArr6[0] = -13816256;
        Lit627 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -13816256;
        Lit625 = IntNum.make(iArr7);
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy_copy_copy_copy");
        Lit624 = (SimpleSymbol) simpleSymbol57.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit623 = fString64;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit622 = fString65;
        new SimpleSymbol("Space2_copy_copy_copy_copy_copy_copy_copy");
        Lit620 = (SimpleSymbol) simpleSymbol58.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit619 = fString66;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit618 = fString67;
        new SimpleSymbol("Space4");
        Lit616 = (SimpleSymbol) simpleSymbol59.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit615 = fString68;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit614 = fString69;
        int[] iArr8 = new int[2];
        iArr8[0] = -1;
        Lit613 = IntNum.make(iArr8);
        new SimpleSymbol("BtcAlis");
        Lit612 = (SimpleSymbol) simpleSymbol60.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit611 = fString70;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit610 = fString71;
        int[] iArr9 = new int[2];
        iArr9[0] = -1661076485;
        Lit609 = IntNum.make(iArr9);
        new SimpleSymbol("Label4_copy_copy_copy_copy_copy_copy_copy");
        Lit608 = (SimpleSymbol) simpleSymbol61.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit607 = fString72;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit606 = fString73;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy_copy_copy_copy_copy_copy");
        Lit605 = (SimpleSymbol) simpleSymbol62.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit604 = fString74;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit603 = fString75;
        int[] iArr10 = new int[2];
        iArr10[0] = -1661076485;
        Lit602 = IntNum.make(iArr10);
        new SimpleSymbol("Label3_copy_copy_copy_copy_copy_copy_copy");
        Lit601 = (SimpleSymbol) simpleSymbol63.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit600 = fString76;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit599 = fString77;
        int[] iArr11 = new int[2];
        iArr11[0] = -1;
        Lit598 = IntNum.make(iArr11);
        new SimpleSymbol("Label2_copy_copy_copy_copy_copy_copy_copy");
        Lit597 = (SimpleSymbol) simpleSymbol64.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit596 = fString78;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit595 = fString79;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy_copy_copy_copy_copy_copy");
        Lit594 = (SimpleSymbol) simpleSymbol65.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit593 = fString80;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit592 = fString81;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy_copy");
        Lit591 = (SimpleSymbol) simpleSymbol66.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit590 = fString82;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit589 = fString83;
        new SimpleSymbol("Space3_copy_copy_copy_copy_copy_copy_copy");
        Lit587 = (SimpleSymbol) simpleSymbol67.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit586 = fString84;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit585 = fString85;
        int[] iArr12 = new int[2];
        iArr12[0] = -92160;
        Lit584 = IntNum.make(iArr12);
        new SimpleSymbol("Label1_copy_copy_copy_copy_copy_copy_copy");
        Lit583 = (SimpleSymbol) simpleSymbol68.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit582 = fString86;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit581 = fString87;
        new SimpleSymbol("Space1_copy_copy_copy_copy_copy_copy_copy");
        Lit579 = (SimpleSymbol) simpleSymbol69.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit578 = fString88;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit577 = fString89;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy_copy");
        Lit576 = (SimpleSymbol) simpleSymbol70.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit575 = fString90;
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy_copy_copy$Click");
        Lit574 = (SimpleSymbol) simpleSymbol71.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit572 = fString91;
        int[] iArr13 = new int[2];
        iArr13[0] = -13816256;
        Lit570 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -13816256;
        Lit568 = IntNum.make(iArr14);
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy_copy_copy");
        Lit567 = (SimpleSymbol) simpleSymbol72.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit566 = fString92;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit565 = fString93;
        new SimpleSymbol("Space2_copy_copy_copy_copy_copy_copy");
        Lit563 = (SimpleSymbol) simpleSymbol73.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit562 = fString94;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit561 = fString95;
        int[] iArr15 = new int[2];
        iArr15[0] = -1;
        Lit560 = IntNum.make(iArr15);
        new SimpleSymbol("WonSatis");
        Lit559 = (SimpleSymbol) simpleSymbol74.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit558 = fString96;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit557 = fString97;
        int[] iArr16 = new int[2];
        iArr16[0] = -1661076485;
        Lit556 = IntNum.make(iArr16);
        new SimpleSymbol("Label6_copy_copy_copy_copy_copy_copy");
        Lit555 = (SimpleSymbol) simpleSymbol75.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit554 = fString98;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit553 = fString99;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy_copy_copy_copy_copy");
        Lit552 = (SimpleSymbol) simpleSymbol76.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit551 = fString100;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit550 = fString101;
        int[] iArr17 = new int[2];
        iArr17[0] = -1;
        Lit549 = IntNum.make(iArr17);
        new SimpleSymbol("WonAlis");
        Lit548 = (SimpleSymbol) simpleSymbol77.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit547 = fString102;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit546 = fString103;
        int[] iArr18 = new int[2];
        iArr18[0] = -1661076485;
        Lit545 = IntNum.make(iArr18);
        new SimpleSymbol("Label4_copy_copy_copy_copy_copy_copy");
        Lit544 = (SimpleSymbol) simpleSymbol78.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit543 = fString104;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit542 = fString105;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy_copy_copy_copy_copy");
        Lit541 = (SimpleSymbol) simpleSymbol79.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit540 = fString106;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit539 = fString107;
        int[] iArr19 = new int[2];
        iArr19[0] = -1661076485;
        Lit538 = IntNum.make(iArr19);
        new SimpleSymbol("Label3_copy_copy_copy_copy_copy_copy");
        Lit537 = (SimpleSymbol) simpleSymbol80.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit536 = fString108;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit535 = fString109;
        int[] iArr20 = new int[2];
        iArr20[0] = -1;
        Lit534 = IntNum.make(iArr20);
        new SimpleSymbol("Label2_copy_copy_copy_copy_copy_copy");
        Lit533 = (SimpleSymbol) simpleSymbol81.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit532 = fString110;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit531 = fString111;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy_copy_copy_copy_copy");
        Lit530 = (SimpleSymbol) simpleSymbol82.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit529 = fString112;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit528 = fString113;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy");
        Lit527 = (SimpleSymbol) simpleSymbol83.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit526 = fString114;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit525 = fString115;
        new SimpleSymbol("Space3_copy_copy_copy_copy_copy_copy");
        Lit523 = (SimpleSymbol) simpleSymbol84.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit522 = fString116;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit521 = fString117;
        int[] iArr21 = new int[2];
        iArr21[0] = -7617974;
        Lit520 = IntNum.make(iArr21);
        new SimpleSymbol("Marquee");
        Lit519 = (SimpleSymbol) simpleSymbol85.readResolve();
        new SimpleSymbol("Label1_copy_copy_copy_copy_copy_copy");
        Lit518 = (SimpleSymbol) simpleSymbol86.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit517 = fString118;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit516 = fString119;
        new SimpleSymbol("Space1_copy_copy_copy_copy_copy_copy");
        Lit514 = (SimpleSymbol) simpleSymbol87.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit513 = fString120;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit512 = fString121;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy");
        Lit511 = (SimpleSymbol) simpleSymbol88.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit510 = fString122;
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy_copy$Click");
        Lit509 = (SimpleSymbol) simpleSymbol89.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit507 = fString123;
        int[] iArr22 = new int[2];
        iArr22[0] = -13816256;
        Lit505 = IntNum.make(iArr22);
        int[] iArr23 = new int[2];
        iArr23[0] = -13816256;
        Lit503 = IntNum.make(iArr23);
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy_copy");
        Lit502 = (SimpleSymbol) simpleSymbol90.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit501 = fString124;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit500 = fString125;
        new SimpleSymbol("Space2_copy_copy_copy_copy_copy");
        Lit498 = (SimpleSymbol) simpleSymbol91.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit497 = fString126;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit496 = fString127;
        int[] iArr24 = new int[2];
        iArr24[0] = -1;
        Lit495 = IntNum.make(iArr24);
        new SimpleSymbol("JpySatis");
        Lit494 = (SimpleSymbol) simpleSymbol92.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit493 = fString128;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit492 = fString129;
        int[] iArr25 = new int[2];
        iArr25[0] = -1661076485;
        Lit491 = IntNum.make(iArr25);
        new SimpleSymbol("Label6_copy_copy_copy_copy_copy");
        Lit490 = (SimpleSymbol) simpleSymbol93.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit489 = fString130;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit488 = fString131;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy_copy_copy_copy");
        Lit487 = (SimpleSymbol) simpleSymbol94.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit486 = fString132;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit485 = fString133;
        int[] iArr26 = new int[2];
        iArr26[0] = -1;
        Lit484 = IntNum.make(iArr26);
        new SimpleSymbol("JpyAlis");
        Lit483 = (SimpleSymbol) simpleSymbol95.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit482 = fString134;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit481 = fString135;
        int[] iArr27 = new int[2];
        iArr27[0] = -1661076485;
        Lit480 = IntNum.make(iArr27);
        new SimpleSymbol("Label4_copy_copy_copy_copy_copy");
        Lit479 = (SimpleSymbol) simpleSymbol96.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit478 = fString136;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit477 = fString137;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy_copy_copy_copy");
        Lit476 = (SimpleSymbol) simpleSymbol97.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit475 = fString138;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit474 = fString139;
        int[] iArr28 = new int[2];
        iArr28[0] = -1661076485;
        Lit473 = IntNum.make(iArr28);
        new SimpleSymbol("Label3_copy_copy_copy_copy_copy");
        Lit472 = (SimpleSymbol) simpleSymbol98.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit471 = fString140;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit470 = fString141;
        int[] iArr29 = new int[2];
        iArr29[0] = -1;
        Lit469 = IntNum.make(iArr29);
        new SimpleSymbol("Label2_copy_copy_copy_copy_copy");
        Lit468 = (SimpleSymbol) simpleSymbol99.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit467 = fString142;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit466 = fString143;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy_copy_copy_copy");
        Lit465 = (SimpleSymbol) simpleSymbol100.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit464 = fString144;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit463 = fString145;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy_copy_copy_copy");
        Lit462 = (SimpleSymbol) simpleSymbol101.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit461 = fString146;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit460 = fString147;
        new SimpleSymbol("Space3_copy_copy_copy_copy_copy");
        Lit458 = (SimpleSymbol) simpleSymbol102.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit457 = fString148;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit456 = fString149;
        int[] iArr30 = new int[2];
        iArr30[0] = -1118482;
        Lit455 = IntNum.make(iArr30);
        new SimpleSymbol("Label1_copy_copy_copy_copy_copy");
        Lit454 = (SimpleSymbol) simpleSymbol103.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit453 = fString150;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit452 = fString151;
        new SimpleSymbol("Space1_copy_copy_copy_copy_copy");
        Lit450 = (SimpleSymbol) simpleSymbol104.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit449 = fString152;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit448 = fString153;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy_copy_copy_copy");
        Lit447 = (SimpleSymbol) simpleSymbol105.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit446 = fString154;
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy$Click");
        Lit445 = (SimpleSymbol) simpleSymbol106.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit443 = fString155;
        int[] iArr31 = new int[2];
        iArr31[0] = -13816256;
        Lit441 = IntNum.make(iArr31);
        int[] iArr32 = new int[2];
        iArr32[0] = -13816256;
        Lit439 = IntNum.make(iArr32);
        new SimpleSymbol("Card_View1_copy_copy_copy_copy_copy");
        Lit438 = (SimpleSymbol) simpleSymbol107.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit437 = fString156;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit436 = fString157;
        new SimpleSymbol("Space2_copy_copy_copy_copy");
        Lit434 = (SimpleSymbol) simpleSymbol108.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit433 = fString158;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit432 = fString159;
        int[] iArr33 = new int[2];
        iArr33[0] = -1;
        Lit431 = IntNum.make(iArr33);
        new SimpleSymbol("RubleSatis");
        Lit430 = (SimpleSymbol) simpleSymbol109.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit429 = fString160;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit428 = fString161;
        int[] iArr34 = new int[2];
        iArr34[0] = -1661076485;
        Lit427 = IntNum.make(iArr34);
        new SimpleSymbol("Label6_copy_copy_copy_copy");
        Lit426 = (SimpleSymbol) simpleSymbol110.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit425 = fString162;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit424 = fString163;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy_copy_copy");
        Lit423 = (SimpleSymbol) simpleSymbol111.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit422 = fString164;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit421 = fString165;
        int[] iArr35 = new int[2];
        iArr35[0] = -1;
        Lit420 = IntNum.make(iArr35);
        new SimpleSymbol("RubleAlis");
        Lit419 = (SimpleSymbol) simpleSymbol112.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit418 = fString166;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit417 = fString167;
        int[] iArr36 = new int[2];
        iArr36[0] = -1661076485;
        Lit416 = IntNum.make(iArr36);
        new SimpleSymbol("Label4_copy_copy_copy_copy");
        Lit415 = (SimpleSymbol) simpleSymbol113.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit414 = fString168;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit413 = fString169;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy_copy_copy");
        Lit412 = (SimpleSymbol) simpleSymbol114.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit411 = fString170;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit410 = fString171;
        int[] iArr37 = new int[2];
        iArr37[0] = -1661076485;
        Lit409 = IntNum.make(iArr37);
        new SimpleSymbol("Label3_copy_copy_copy_copy");
        Lit408 = (SimpleSymbol) simpleSymbol115.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit407 = fString172;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit406 = fString173;
        int[] iArr38 = new int[2];
        iArr38[0] = -1;
        Lit405 = IntNum.make(iArr38);
        new SimpleSymbol("Label2_copy_copy_copy_copy");
        Lit404 = (SimpleSymbol) simpleSymbol116.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit403 = fString174;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit402 = fString175;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy_copy_copy");
        Lit401 = (SimpleSymbol) simpleSymbol117.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit400 = fString176;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit399 = fString177;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy_copy_copy");            
        Lit398 = (SimpleSymbol) simpleSymbol118.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit397 = fString178;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit396 = fString179;
        new SimpleSymbol("Space3_copy_copy_copy_copy");
        Lit394 = (SimpleSymbol) simpleSymbol119.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit393 = fString180;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit392 = fString181;
        int[] iArr39 = new int[2];
        iArr39[0] = -14575886;
        Lit391 = IntNum.make(iArr39);
        new SimpleSymbol("Label1_copy_copy_copy_copy");
        Lit390 = (SimpleSymbol) simpleSymbol120.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit389 = fString182;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit388 = fString183;
        new SimpleSymbol("Space1_copy_copy_copy_copy");
        Lit386 = (SimpleSymbol) simpleSymbol121.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit385 = fString184;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit384 = fString185;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy_copy_copy");
        Lit383 = (SimpleSymbol) simpleSymbol122.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit382 = fString186;
        new SimpleSymbol("Card_View1_copy_copy_copy_copy$Click");
        Lit381 = (SimpleSymbol) simpleSymbol123.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit379 = fString187;
        int[] iArr40 = new int[2];
        iArr40[0] = -13816256;
        Lit377 = IntNum.make(iArr40);
        int[] iArr41 = new int[2];
        iArr41[0] = -13816256;
        Lit375 = IntNum.make(iArr41);
        new SimpleSymbol("Card_View1_copy_copy_copy_copy");
        Lit374 = (SimpleSymbol) simpleSymbol124.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit373 = fString188;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit372 = fString189;
        new SimpleSymbol("Space2_copy_copy_copy");
        Lit370 = (SimpleSymbol) simpleSymbol125.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit369 = fString190;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit368 = fString191;
        int[] iArr42 = new int[2];
        iArr42[0] = -1;
        Lit367 = IntNum.make(iArr42);
        new SimpleSymbol("CanadaSatis");
        Lit366 = (SimpleSymbol) simpleSymbol126.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit365 = fString192;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit364 = fString193;
        int[] iArr43 = new int[2];
        iArr43[0] = -1661076485;
        Lit363 = IntNum.make(iArr43);
        new SimpleSymbol("Label6_copy_copy_copy");
        Lit362 = (SimpleSymbol) simpleSymbol127.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit361 = fString194;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit360 = fString195;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy_copy");
        Lit359 = (SimpleSymbol) simpleSymbol128.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit358 = fString196;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit357 = fString197;
        int[] iArr44 = new int[2];
        iArr44[0] = -1;
        Lit356 = IntNum.make(iArr44);
        new SimpleSymbol("CanadaAlis");
        Lit355 = (SimpleSymbol) simpleSymbol129.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit354 = fString198;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit353 = fString199;
        int[] iArr45 = new int[2];
        iArr45[0] = -1661076485;
        Lit352 = IntNum.make(iArr45);
        new SimpleSymbol("Label4_copy_copy_copy");
        Lit351 = (SimpleSymbol) simpleSymbol130.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit350 = fString200;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit349 = fString201;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy_copy");
        Lit348 = (SimpleSymbol) simpleSymbol131.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit347 = fString202;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit346 = fString203;
        int[] iArr46 = new int[2];
        iArr46[0] = -1661076485;
        Lit345 = IntNum.make(iArr46);
        new SimpleSymbol("Label3_copy_copy_copy");
        Lit344 = (SimpleSymbol) simpleSymbol132.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit343 = fString204;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit342 = fString205;
        int[] iArr47 = new int[2];
        iArr47[0] = -1;
        Lit341 = IntNum.make(iArr47);
        new SimpleSymbol("Label2_copy_copy_copy");
        Lit340 = (SimpleSymbol) simpleSymbol133.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit339 = fString206;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit338 = fString207;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy_copy");
        Lit337 = (SimpleSymbol) simpleSymbol134.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit336 = fString208;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit335 = fString209;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy_copy");
        Lit334 = (SimpleSymbol) simpleSymbol135.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit333 = fString210;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit332 = fString211;
        new SimpleSymbol("Space3_copy_copy_copy");
        Lit330 = (SimpleSymbol) simpleSymbol136.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit329 = fString212;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit328 = fString213;
        int[] iArr48 = new int[2];
        iArr48[0] = -769226;
        Lit327 = IntNum.make(iArr48);
        new SimpleSymbol("Label1_copy_copy_copy");
        Lit325 = (SimpleSymbol) simpleSymbol137.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit324 = fString214;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit323 = fString215;
        new SimpleSymbol("Space1_copy_copy_copy");
        Lit321 = (SimpleSymbol) simpleSymbol138.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit320 = fString216;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit319 = fString217;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy_copy");
        Lit318 = (SimpleSymbol) simpleSymbol139.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit317 = fString218;
        new SimpleSymbol("Card_View1_copy_copy_copy$Click");
        Lit316 = (SimpleSymbol) simpleSymbol140.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit314 = fString219;
        int[] iArr49 = new int[2];
        iArr49[0] = -13816256;
        Lit312 = IntNum.make(iArr49);
        int[] iArr50 = new int[2];
        iArr50[0] = -13816256;
        Lit310 = IntNum.make(iArr50);
        new SimpleSymbol("Card_View1_copy_copy_copy");
        Lit309 = (SimpleSymbol) simpleSymbol141.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit308 = fString220;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit307 = fString221;
        new SimpleSymbol("Space2_copy_copy");
        Lit305 = (SimpleSymbol) simpleSymbol142.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit304 = fString222;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit303 = fString223;
        int[] iArr51 = new int[2];
        iArr51[0] = -1;
        Lit302 = IntNum.make(iArr51);
        new SimpleSymbol("SterlinSatis");
        Lit301 = (SimpleSymbol) simpleSymbol143.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit300 = fString224;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit299 = fString225;
        int[] iArr52 = new int[2];
        iArr52[0] = -1661076485;
        Lit298 = IntNum.make(iArr52);
        new SimpleSymbol("Label6_copy_copy");
        Lit297 = (SimpleSymbol) simpleSymbol144.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit296 = fString226;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit295 = fString227;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy");
        Lit294 = (SimpleSymbol) simpleSymbol145.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit293 = fString228;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit292 = fString229;
        int[] iArr53 = new int[2];
        iArr53[0] = -1;
        Lit291 = IntNum.make(iArr53);
        new SimpleSymbol("SterlinAlis");
        Lit290 = (SimpleSymbol) simpleSymbol146.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit289 = fString230;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit288 = fString231;
        int[] iArr54 = new int[2];
        iArr54[0] = -1661076485;
        Lit287 = IntNum.make(iArr54);
        new SimpleSymbol("Label4_copy_copy");
        Lit286 = (SimpleSymbol) simpleSymbol147.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit285 = fString232;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit284 = fString233;
        new SimpleSymbol("Vertical_Arrangement3_copy_copy");
        Lit283 = (SimpleSymbol) simpleSymbol148.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit282 = fString234;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit281 = fString235;
        int[] iArr55 = new int[2];
        iArr55[0] = -1661076485;
        Lit280 = IntNum.make(iArr55);
        new SimpleSymbol("labelll");
        Lit279 = (SimpleSymbol) simpleSymbol149.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit278 = fString236;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit277 = fString237;
        int[] iArr56 = new int[2];
        iArr56[0] = -1;
        Lit276 = IntNum.make(iArr56);
        new SimpleSymbol("Label2_copy_copy");
        Lit275 = (SimpleSymbol) simpleSymbol150.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit274 = fString238;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit273 = fString239;
        new SimpleSymbol("Vertical_Arrangement1_copy_copy");
        Lit272 = (SimpleSymbol) simpleSymbol151.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit271 = fString240;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit270 = fString241;
        new SimpleSymbol("Horizontal_Arrangement2_copy_copy");
        Lit269 = (SimpleSymbol) simpleSymbol152.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit268 = fString242;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit267 = fString243;
        new SimpleSymbol("Space3_copy_copy");
        Lit265 = (SimpleSymbol) simpleSymbol153.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit264 = fString244;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit263 = fString245;
        int[] iArr57 = new int[2];
        iArr57[0] = -718736;
        Lit262 = IntNum.make(iArr57);
        new SimpleSymbol("Label1_copy_copy");
        Lit261 = (SimpleSymbol) simpleSymbol154.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit260 = fString246;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit259 = fString247;
        new SimpleSymbol("Space1_copy_copy");
        Lit257 = (SimpleSymbol) simpleSymbol155.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit256 = fString248;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit255 = fString249;
        new SimpleSymbol("Horizontal_Arrangement1_copy_copy");
        Lit254 = (SimpleSymbol) simpleSymbol156.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit253 = fString250;
        new SimpleSymbol("Card_View1_copy_copy$Click");
        Lit252 = (SimpleSymbol) simpleSymbol157.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit250 = fString251;
        int[] iArr58 = new int[2];
        iArr58[0] = -13816256;
        Lit248 = IntNum.make(iArr58);
        int[] iArr59 = new int[2];
        iArr59[0] = -13816256;
        Lit246 = IntNum.make(iArr59);
        new SimpleSymbol("Card_View1_copy_copy");
        Lit245 = (SimpleSymbol) simpleSymbol158.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit244 = fString252;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit243 = fString253;
        new SimpleSymbol("Space2_copy");
        Lit241 = (SimpleSymbol) simpleSymbol159.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit240 = fString254;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit239 = fString255;
        int[] iArr60 = new int[2];
        iArr60[0] = -1;
        Lit238 = IntNum.make(iArr60);
        new SimpleSymbol("EuroSatis");
        Lit237 = (SimpleSymbol) simpleSymbol160.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit236 = fString256;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit235 = fString257;
        int[] iArr61 = new int[2];
        iArr61[0] = -1661076485;
        Lit234 = IntNum.make(iArr61);
        new SimpleSymbol("Label6_copy");
        Lit233 = (SimpleSymbol) simpleSymbol161.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit232 = fString258;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit231 = fString259;
        new SimpleSymbol("Vertical_Arrangement2_copy");
        Lit230 = (SimpleSymbol) simpleSymbol162.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit229 = fString260;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit228 = fString261;
        int[] iArr62 = new int[2];
        iArr62[0] = -1;
        Lit227 = IntNum.make(iArr62);
        new SimpleSymbol("EuroAlis");
        Lit226 = (SimpleSymbol) simpleSymbol163.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit225 = fString262;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit224 = fString263;
        int[] iArr63 = new int[2];
        iArr63[0] = -1661076485;
        Lit223 = IntNum.make(iArr63);
        new SimpleSymbol("Label4_copy");
        Lit222 = (SimpleSymbol) simpleSymbol164.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit221 = fString264;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit220 = fString265;
        new SimpleSymbol("Vertical_Arrangement3_copy");
        Lit219 = (SimpleSymbol) simpleSymbol165.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit218 = fString266;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit217 = fString267;
        int[] iArr64 = new int[2];
        iArr64[0] = -1661076485;
        Lit216 = IntNum.make(iArr64);
        new SimpleSymbol("Label3_copy");
        Lit215 = (SimpleSymbol) simpleSymbol166.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit214 = fString268;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit213 = fString269;
        int[] iArr65 = new int[2];
        iArr65[0] = -1;
        Lit212 = IntNum.make(iArr65);
        new SimpleSymbol("Label2_copy");
        Lit211 = (SimpleSymbol) simpleSymbol167.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit210 = fString270;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit209 = fString271;
        new SimpleSymbol("Vertical_Arrangement1_copy");
        Lit208 = (SimpleSymbol) simpleSymbol168.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit207 = fString272;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit206 = fString273;
        new SimpleSymbol("Horizontal_Arrangement2_copy");
        Lit205 = (SimpleSymbol) simpleSymbol169.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit204 = fString274;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit203 = fString275;
        new SimpleSymbol("Space3_copy");
        Lit201 = (SimpleSymbol) simpleSymbol170.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit200 = fString276;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit199 = fString277;
        int[] iArr66 = new int[2];
        iArr66[0] = -22229507;
        Lit198 = IntNum.make(iArr66);
        new SimpleSymbol("Label1_copy");
        Lit197 = (SimpleSymbol) simpleSymbol171.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit196 = fString278;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit195 = fString279;
        new SimpleSymbol("Space1_copy");
        Lit193 = (SimpleSymbol) simpleSymbol172.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit192 = fString280;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit191 = fString281;
        new SimpleSymbol("Horizontal_Arrangement1_copy");
        Lit190 = (SimpleSymbol) simpleSymbol173.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit189 = fString282;
        new SimpleSymbol("Card_View1_copy$Click");
        Lit188 = (SimpleSymbol) simpleSymbol174.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit186 = fString283;
        int[] iArr67 = new int[2];
        iArr67[0] = -13816256;
        Lit184 = IntNum.make(iArr67);
        int[] iArr68 = new int[2];
        iArr68[0] = -13816256;
        Lit182 = IntNum.make(iArr68);
        new SimpleSymbol("Card_View1_copy");
        Lit181 = (SimpleSymbol) simpleSymbol175.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit180 = fString284;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit179 = fString285;
        new SimpleSymbol("Space2");
        Lit177 = (SimpleSymbol) simpleSymbol176.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit176 = fString286;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit175 = fString287;
        int[] iArr69 = new int[2];
        iArr69[0] = -1;
        Lit174 = IntNum.make(iArr69);
        new SimpleSymbol("DolarSatis");
        Lit173 = (SimpleSymbol) simpleSymbol177.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit172 = fString288;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit171 = fString289;
        int[] iArr70 = new int[2];
        iArr70[0] = -1661076485;
        Lit170 = IntNum.make(iArr70);
        new SimpleSymbol("Label6");
        Lit169 = (SimpleSymbol) simpleSymbol178.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit168 = fString290;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit167 = fString291;
        new SimpleSymbol("Vertical_Arrangement2");
        Lit166 = (SimpleSymbol) simpleSymbol179.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit165 = fString292;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit164 = fString293;
        int[] iArr71 = new int[2];
        iArr71[0] = -1;
        Lit163 = IntNum.make(iArr71);
        new SimpleSymbol("DolarAlis");
        Lit162 = (SimpleSymbol) simpleSymbol180.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit161 = fString294;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit160 = fString295;
        int[] iArr72 = new int[2];
        iArr72[0] = -1661076485;
        Lit159 = IntNum.make(iArr72);
        new SimpleSymbol("Label4");
        Lit157 = (SimpleSymbol) simpleSymbol181.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit156 = fString296;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit155 = fString297;
        new SimpleSymbol("Vertical_Arrangement3");
        Lit154 = (SimpleSymbol) simpleSymbol182.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit153 = fString298;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit152 = fString299;
        int[] iArr73 = new int[2];
        iArr73[0] = -1661076485;
        Lit151 = IntNum.make(iArr73);
        new SimpleSymbol("Label3");
        Lit149 = (SimpleSymbol) simpleSymbol183.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit148 = fString300;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit147 = fString301;
        int[] iArr74 = new int[2];
        iArr74[0] = -1;
        Lit146 = IntNum.make(iArr74);
        new SimpleSymbol("FontBold");
        Lit144 = (SimpleSymbol) simpleSymbol184.readResolve();
        new SimpleSymbol("Label2");
        Lit143 = (SimpleSymbol) simpleSymbol185.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit142 = fString302;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit141 = fString303;
        new SimpleSymbol("Vertical_Arrangement1");
        Lit140 = (SimpleSymbol) simpleSymbol186.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit139 = fString304;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit138 = fString305;
        new SimpleSymbol("Horizontal_Arrangement2");
        Lit137 = (SimpleSymbol) simpleSymbol187.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit136 = fString306;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit135 = fString307;
        new SimpleSymbol("Space3");
        Lit133 = (SimpleSymbol) simpleSymbol188.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit132 = fString308;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit131 = fString309;
        int[] iArr75 = new int[2];
        iArr75[0] = -224739;
        Lit130 = IntNum.make(iArr75);
        new SimpleSymbol("TextColor");
        Lit129 = (SimpleSymbol) simpleSymbol189.readResolve();
        new SimpleSymbol("Text");
        Lit128 = (SimpleSymbol) simpleSymbol190.readResolve();
        new SimpleSymbol("HTMLFormat");
        Lit127 = (SimpleSymbol) simpleSymbol191.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit125 = (SimpleSymbol) simpleSymbol192.readResolve();
        new SimpleSymbol("FontSize");
        Lit123 = (SimpleSymbol) simpleSymbol193.readResolve();
        new SimpleSymbol("Label1");
        Lit122 = (SimpleSymbol) simpleSymbol194.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit121 = fString310;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit120 = fString311;
        new SimpleSymbol("Space1");
        Lit118 = (SimpleSymbol) simpleSymbol195.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit117 = fString312;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit116 = fString313;
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit115 = (SimpleSymbol) simpleSymbol196.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit114 = fString314;
        new SimpleSymbol("Click");
        Lit113 = (SimpleSymbol) simpleSymbol197.readResolve();
        new SimpleSymbol("Card_View1$Click");
        Lit112 = (SimpleSymbol) simpleSymbol198.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit110 = fString315;
        int[] iArr76 = new int[2];
        iArr76[0] = -13816256;
        Lit108 = IntNum.make(iArr76);
        new SimpleSymbol("StrokeColor");
        Lit107 = (SimpleSymbol) simpleSymbol199.readResolve();
        new SimpleSymbol("FullClickable");
        Lit105 = (SimpleSymbol) simpleSymbol200.readResolve();
        new SimpleSymbol("CornerRadius");
        Lit103 = (SimpleSymbol) simpleSymbol201.readResolve();
        new SimpleSymbol("ContentPaddingTop");
        Lit102 = (SimpleSymbol) simpleSymbol202.readResolve();
        new SimpleSymbol("ContentPaddingRight");
        Lit101 = (SimpleSymbol) simpleSymbol203.readResolve();
        new SimpleSymbol("ContentPaddingLeft");
        Lit100 = (SimpleSymbol) simpleSymbol204.readResolve();
        new SimpleSymbol("ContentPaddingBottom");
        Lit99 = (SimpleSymbol) simpleSymbol205.readResolve();
        int[] iArr77 = new int[2];
        iArr77[0] = -13816256;
        Lit98 = IntNum.make(iArr77);
        new SimpleSymbol("Card_View1");
        Lit97 = (SimpleSymbol) simpleSymbol206.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit96 = fString316;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit95 = fString317;
        new SimpleSymbol("RotationAngle");
        Lit93 = (SimpleSymbol) simpleSymbol207.readResolve();
        new SimpleSymbol("Picture");
        Lit92 = (SimpleSymbol) simpleSymbol208.readResolve();
        new SimpleSymbol("Image1");
        Lit91 = (SimpleSymbol) simpleSymbol209.readResolve();
        new FString("com.google.appinventor.components.runtime.Image");
        Lit90 = fString318;
        new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit89 = fString319;
        new SimpleSymbol("Width");
        Lit88 = (SimpleSymbol) simpleSymbol210.readResolve();
        new SimpleSymbol("Height");
        Lit86 = (SimpleSymbol) simpleSymbol211.readResolve();
        new SimpleSymbol("Vertical_Scroll_Arrangement1");
        Lit85 = (SimpleSymbol) simpleSymbol212.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit84 = fString320;
        new SimpleSymbol("Initialize");
        Lit83 = (SimpleSymbol) simpleSymbol213.readResolve();
        new SimpleSymbol("Screen1$Initialize");
        Lit82 = (SimpleSymbol) simpleSymbol214.readResolve();
        new SimpleSymbol("TitleBarSubTitle");
        Lit81 = (SimpleSymbol) simpleSymbol215.readResolve();
        new SimpleSymbol("TitleBarFontTypeface");
        Lit79 = (SimpleSymbol) simpleSymbol216.readResolve();
        new SimpleSymbol("Title");
        Lit78 = (SimpleSymbol) simpleSymbol217.readResolve();
        new SimpleSymbol("SplashIcon");
        Lit77 = (SimpleSymbol) simpleSymbol218.readResolve();
        new SimpleSymbol("SplashEnabled");
        Lit76 = (SimpleSymbol) simpleSymbol219.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit75 = (SimpleSymbol) simpleSymbol220.readResolve();
        new SimpleSymbol("boolean");
        Lit74 = (SimpleSymbol) simpleSymbol221.readResolve();
        new SimpleSymbol("Scrollable");
        Lit73 = (SimpleSymbol) simpleSymbol222.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit72 = (SimpleSymbol) simpleSymbol223.readResolve();
        int[] iArr78 = new int[2];
        iArr78[0] = -14474700;
        Lit71 = IntNum.make(iArr78);
        new SimpleSymbol("PrimaryColorDark");
        Lit70 = (SimpleSymbol) simpleSymbol224.readResolve();
        int[] iArr79 = new int[2];
        iArr79[0] = -14474700;
        Lit69 = IntNum.make(iArr79);
        new SimpleSymbol("PrimaryColor");
        Lit68 = (SimpleSymbol) simpleSymbol225.readResolve();
        int[] iArr80 = new int[2];
        iArr80[0] = -14474700;
        Lit67 = IntNum.make(iArr80);
        new SimpleSymbol("NavigationBarColor");
        Lit66 = (SimpleSymbol) simpleSymbol226.readResolve();
        int[] iArr81 = new int[2];
        iArr81[0] = -14474700;
        Lit65 = IntNum.make(iArr81);
        new SimpleSymbol("BackgroundColor");
        Lit64 = (SimpleSymbol) simpleSymbol227.readResolve();
        new SimpleSymbol("AppName");
        Lit63 = (SimpleSymbol) simpleSymbol228.readResolve();
        new SimpleSymbol("AppId");
        Lit62 = (SimpleSymbol) simpleSymbol229.readResolve();
        new SimpleSymbol("AlignVertical");
        Lit60 = (SimpleSymbol) simpleSymbol230.readResolve();
        new SimpleSymbol("AlignHorizontal");
        Lit58 = (SimpleSymbol) simpleSymbol231.readResolve();
        int[] iArr82 = new int[2];
        iArr82[0] = -14474700;
        Lit56 = IntNum.make(iArr82);
        new SimpleSymbol("AccentColor");
        Lit55 = (SimpleSymbol) simpleSymbol232.readResolve();
        new SimpleSymbol("AboutScreenTitle");
        Lit53 = (SimpleSymbol) simpleSymbol233.readResolve();
        new SimpleSymbol("ethAlis");
        Lit35 = (SimpleSymbol) simpleSymbol234.readResolve();
        new SimpleSymbol("btcAlis");
        Lit33 = (SimpleSymbol) simpleSymbol235.readResolve();
        new SimpleSymbol("wonSatis");
        Lit31 = (SimpleSymbol) simpleSymbol236.readResolve();
        new SimpleSymbol("wonAlis");
        Lit29 = (SimpleSymbol) simpleSymbol237.readResolve();
        new SimpleSymbol("jpySatis");
        Lit27 = (SimpleSymbol) simpleSymbol238.readResolve();
        new SimpleSymbol("jpyAlis");
        Lit25 = (SimpleSymbol) simpleSymbol239.readResolve();
        new SimpleSymbol("rubleSatis");
        Lit23 = (SimpleSymbol) simpleSymbol240.readResolve();
        new SimpleSymbol("rubleAlis");
        Lit21 = (SimpleSymbol) simpleSymbol241.readResolve();
        new SimpleSymbol("canadaSatis");
        Lit19 = (SimpleSymbol) simpleSymbol242.readResolve();
        new SimpleSymbol("canadaAlis");
        Lit17 = (SimpleSymbol) simpleSymbol243.readResolve();
        new SimpleSymbol("sterlinSatis");
        Lit15 = (SimpleSymbol) simpleSymbol244.readResolve();
        new SimpleSymbol("sterlinAlis");
        Lit13 = (SimpleSymbol) simpleSymbol245.readResolve();
        new SimpleSymbol("euroSatis");
        Lit11 = (SimpleSymbol) simpleSymbol246.readResolve();
        new SimpleSymbol("euroAlis");
        Lit9 = (SimpleSymbol) simpleSymbol247.readResolve();
        new SimpleSymbol("dolarSatis");
        Lit7 = (SimpleSymbol) simpleSymbol248.readResolve();
        new SimpleSymbol("ScrapeData");
        Lit5 = (SimpleSymbol) simpleSymbol249.readResolve();
        new SimpleSymbol("dolarAlis");
        Lit4 = (SimpleSymbol) simpleSymbol250.readResolve();
        new SimpleSymbol("p$veriler");
        Lit3 = (SimpleSymbol) simpleSymbol251.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol252.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol253.readResolve();
        new SimpleSymbol("Screen1");
        Lit0 = (SimpleSymbol) simpleSymbol254.readResolve();
    }

    public Screen1() {
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
        ModuleMethod moduleMethod52;
        ModuleMethod moduleMethod53;
        ModuleMethod moduleMethod54;
        ModuleMethod moduleMethod55;
        ModuleMethod moduleMethod56;
        ModuleMethod moduleMethod57;
        ModuleMethod moduleMethod58;
        ModuleMethod moduleMethod59;
        ModuleMethod moduleMethod60;
        ModuleMethod moduleMethod61;
        ModuleMethod moduleMethod62;
        ModuleMethod moduleMethod63;
        ModuleMethod moduleMethod64;
        ModuleMethod moduleMethod65;
        ModuleMethod moduleMethod66;
        ModuleMethod moduleMethod67;
        ModuleMethod moduleMethod68;
        ModuleMethod moduleMethod69;
        ModuleMethod moduleMethod70;
        ModuleMethod moduleMethod71;
        ModuleMethod moduleMethod72;
        ModuleMethod moduleMethod73;
        ModuleMethod moduleMethod74;
        ModuleMethod moduleMethod75;
        ModuleMethod moduleMethod76;
        ModuleMethod moduleMethod77;
        ModuleMethod moduleMethod78;
        ModuleMethod moduleMethod79;
        ModuleMethod moduleMethod80;
        ModuleMethod moduleMethod81;
        ModuleMethod moduleMethod82;
        ModuleMethod moduleMethod83;
        ModuleMethod moduleMethod84;
        ModuleMethod moduleMethod85;
        ModuleMethod moduleMethod86;
        ModuleMethod moduleMethod87;
        ModuleMethod moduleMethod88;
        ModuleMethod moduleMethod89;
        ModuleMethod moduleMethod90;
        ModuleMethod moduleMethod91;
        ModuleMethod moduleMethod92;
        ModuleMethod moduleMethod93;
        ModuleMethod moduleMethod94;
        ModuleMethod moduleMethod95;
        ModuleMethod moduleMethod96;
        ModuleMethod moduleMethod97;
        ModuleMethod moduleMethod98;
        ModuleMethod moduleMethod99;
        ModuleMethod moduleMethod100;
        ModuleMethod moduleMethod101;
        ModuleMethod moduleMethod102;
        ModuleMethod moduleMethod103;
        ModuleMethod moduleMethod104;
        ModuleMethod moduleMethod105;
        ModuleMethod moduleMethod106;
        ModuleMethod moduleMethod107;
        ModuleMethod moduleMethod108;
        ModuleMethod moduleMethod109;
        ModuleMethod moduleMethod110;
        ModuleMethod moduleMethod111;
        ModuleMethod moduleMethod112;
        ModuleMethod moduleMethod113;
        ModuleMethod moduleMethod114;
        ModuleMethod moduleMethod115;
        ModuleMethod moduleMethod116;
        ModuleMethod moduleMethod117;
        ModuleMethod moduleMethod118;
        ModuleMethod moduleMethod119;
        ModuleMethod moduleMethod120;
        ModuleMethod moduleMethod121;
        ModuleMethod moduleMethod122;
        ModuleMethod moduleMethod123;
        ModuleMethod moduleMethod124;
        ModuleMethod moduleMethod125;
        ModuleMethod moduleMethod126;
        ModuleMethod moduleMethod127;
        ModuleMethod moduleMethod128;
        ModuleMethod moduleMethod129;
        ModuleMethod moduleMethod130;
        ModuleMethod moduleMethod131;
        ModuleMethod moduleMethod132;
        ModuleMethod moduleMethod133;
        ModuleMethod moduleMethod134;
        ModuleMethod moduleMethod135;
        ModuleMethod moduleMethod136;
        ModuleMethod moduleMethod137;
        ModuleMethod moduleMethod138;
        ModuleMethod moduleMethod139;
        ModuleMethod moduleMethod140;
        ModuleMethod moduleMethod141;
        ModuleMethod moduleMethod142;
        ModuleMethod moduleMethod143;
        ModuleMethod moduleMethod144;
        ModuleMethod moduleMethod145;
        ModuleMethod moduleMethod146;
        ModuleMethod moduleMethod147;
        ModuleMethod moduleMethod148;
        ModuleMethod moduleMethod149;
        ModuleMethod moduleMethod150;
        ModuleMethod moduleMethod151;
        ModuleMethod moduleMethod152;
        ModuleMethod moduleMethod153;
        ModuleMethod moduleMethod154;
        ModuleMethod moduleMethod155;
        ModuleMethod moduleMethod156;
        ModuleMethod moduleMethod157;
        ModuleMethod moduleMethod158;
        ModuleMethod moduleMethod159;
        ModuleMethod moduleMethod160;
        ModuleMethod moduleMethod161;
        ModuleMethod moduleMethod162;
        ModuleMethod moduleMethod163;
        ModuleMethod moduleMethod164;
        ModuleMethod moduleMethod165;
        ModuleMethod moduleMethod166;
        ModuleMethod moduleMethod167;
        ModuleMethod moduleMethod168;
        ModuleMethod moduleMethod169;
        ModuleMethod moduleMethod170;
        ModuleMethod moduleMethod171;
        ModuleMethod moduleMethod172;
        ModuleMethod moduleMethod173;
        ModuleMethod moduleMethod174;
        ModuleMethod moduleMethod175;
        ModuleMethod moduleMethod176;
        ModuleMethod moduleMethod177;
        ModuleMethod moduleMethod178;
        ModuleMethod moduleMethod179;
        ModuleMethod moduleMethod180;
        ModuleMethod moduleMethod181;
        ModuleMethod moduleMethod182;
        ModuleMethod moduleMethod183;
        ModuleMethod moduleMethod184;
        ModuleMethod moduleMethod185;
        ModuleMethod moduleMethod186;
        ModuleMethod moduleMethod187;
        ModuleMethod moduleMethod188;
        ModuleMethod moduleMethod189;
        ModuleMethod moduleMethod190;
        ModuleMethod moduleMethod191;
        ModuleMethod moduleMethod192;
        ModuleMethod moduleMethod193;
        ModuleMethod moduleMethod194;
        ModuleMethod moduleMethod195;
        ModuleMethod moduleMethod196;
        ModuleMethod moduleMethod197;
        ModuleMethod moduleMethod198;
        ModuleMethod moduleMethod199;
        ModuleMethod moduleMethod200;
        ModuleMethod moduleMethod201;
        ModuleMethod moduleMethod202;
        ModuleMethod moduleMethod203;
        ModuleMethod moduleMethod204;
        ModuleMethod moduleMethod205;
        ModuleMethod moduleMethod206;
        ModuleMethod moduleMethod207;
        ModuleMethod moduleMethod208;
        ModuleMethod moduleMethod209;
        ModuleMethod moduleMethod210;
        ModuleMethod moduleMethod211;
        ModuleMethod moduleMethod212;
        ModuleMethod moduleMethod213;
        ModuleMethod moduleMethod214;
        ModuleMethod moduleMethod215;
        ModuleMethod moduleMethod216;
        ModuleMethod moduleMethod217;
        ModuleMethod moduleMethod218;
        ModuleMethod moduleMethod219;
        ModuleMethod moduleMethod220;
        ModuleMethod moduleMethod221;
        ModuleMethod moduleMethod222;
        ModuleMethod moduleMethod223;
        ModuleMethod moduleMethod224;
        ModuleMethod moduleMethod225;
        ModuleMethod moduleMethod226;
        ModuleMethod moduleMethod227;
        ModuleMethod moduleMethod228;
        ModuleMethod moduleMethod229;
        ModuleMethod moduleMethod230;
        ModuleMethod moduleMethod231;
        ModuleMethod moduleMethod232;
        ModuleMethod moduleMethod233;
        ModuleMethod moduleMethod234;
        ModuleMethod moduleMethod235;
        ModuleMethod moduleMethod236;
        ModuleMethod moduleMethod237;
        ModuleMethod moduleMethod238;
        ModuleMethod moduleMethod239;
        ModuleMethod moduleMethod240;
        ModuleMethod moduleMethod241;
        ModuleMethod moduleMethod242;
        ModuleMethod moduleMethod243;
        ModuleMethod moduleMethod244;
        ModuleMethod moduleMethod245;
        ModuleMethod moduleMethod246;
        ModuleMethod moduleMethod247;
        ModuleMethod moduleMethod248;
        ModuleMethod moduleMethod249;
        ModuleMethod moduleMethod250;
        ModuleMethod moduleMethod251;
        ModuleMethod moduleMethod252;
        ModuleMethod moduleMethod253;
        ModuleMethod moduleMethod254;
        ModuleMethod moduleMethod255;
        ModuleMethod moduleMethod256;
        ModuleMethod moduleMethod257;
        ModuleMethod moduleMethod258;
        ModuleMethod moduleMethod259;
        ModuleMethod moduleMethod260;
        ModuleMethod moduleMethod261;
        ModuleMethod moduleMethod262;
        ModuleMethod moduleMethod263;
        ModuleMethod moduleMethod264;
        ModuleMethod moduleMethod265;
        ModuleMethod moduleMethod266;
        ModuleMethod moduleMethod267;
        ModuleMethod moduleMethod268;
        ModuleMethod moduleMethod269;
        ModuleMethod moduleMethod270;
        ModuleMethod moduleMethod271;
        ModuleMethod moduleMethod272;
        ModuleMethod moduleMethod273;
        ModuleMethod moduleMethod274;
        ModuleMethod moduleMethod275;
        ModuleMethod moduleMethod276;
        ModuleMethod moduleMethod277;
        ModuleMethod moduleMethod278;
        ModuleMethod moduleMethod279;
        ModuleMethod moduleMethod280;
        ModuleMethod moduleMethod281;
        ModuleMethod moduleMethod282;
        ModuleMethod moduleMethod283;
        ModuleMethod moduleMethod284;
        ModuleMethod moduleMethod285;
        ModuleMethod moduleMethod286;
        ModuleMethod moduleMethod287;
        ModuleMethod moduleMethod288;
        ModuleMethod moduleMethod289;
        ModuleMethod moduleMethod290;
        ModuleMethod moduleMethod291;
        ModuleMethod moduleMethod292;
        ModuleMethod moduleMethod293;
        ModuleMethod moduleMethod294;
        ModuleMethod moduleMethod295;
        ModuleMethod moduleMethod296;
        ModuleMethod moduleMethod297;
        ModuleMethod moduleMethod298;
        ModuleMethod moduleMethod299;
        ModuleMethod moduleMethod300;
        ModuleMethod moduleMethod301;
        ModuleMethod moduleMethod302;
        ModuleMethod moduleMethod303;
        ModuleMethod moduleMethod304;
        ModuleMethod moduleMethod305;
        ModuleMethod moduleMethod306;
        ModuleMethod moduleMethod307;
        ModuleMethod moduleMethod308;
        ModuleMethod moduleMethod309;
        ModuleMethod moduleMethod310;
        ModuleMethod moduleMethod311;
        ModuleMethod moduleMethod312;
        ModuleMethod moduleMethod313;
        ModuleMethod moduleMethod314;
        ModuleMethod moduleMethod315;
        ModuleMethod moduleMethod316;
        ModuleMethod moduleMethod317;
        ModuleMethod moduleMethod318;
        ModuleMethod moduleMethod319;
        ModuleMethod moduleMethod320;
        ModuleMethod moduleMethod321;
        ModuleMethod moduleMethod322;
        ModuleMethod moduleMethod323;
        ModuleMethod moduleMethod324;
        ModuleMethod moduleMethod325;
        ModuleMethod moduleMethod326;
        ModuleMethod moduleMethod327;
        ModuleMethod moduleMethod328;
        ModuleMethod moduleMethod329;
        ModuleMethod moduleMethod330;
        ModuleMethod moduleMethod331;
        ModuleMethod moduleMethod332;
        ModuleMethod moduleMethod333;
        ModuleMethod moduleMethod334;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod335 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit789, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod335;
        new ModuleMethod(frame4, 2, Lit790, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit791, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit792, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit793, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit794, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit795, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit796, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit797, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit798, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit799, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit800, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit801, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit802, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod336 = moduleMethod16;
        moduleMethod336.setProperty("source-location", "/tmp/runtime2716208737894551890.scm:615");
        lambda$Fn1 = moduleMethod336;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, (Object) null, 0);
        lambda$Fn4 = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn3 = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn5 = moduleMethod21;
        new ModuleMethod(frame4, 23, Lit82, 0);
        this.Screen1$Initialize = moduleMethod22;
        new ModuleMethod(frame4, 24, (Object) null, 0);
        lambda$Fn6 = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn7 = moduleMethod24;
        new ModuleMethod(frame4, 26, (Object) null, 0);
        lambda$Fn8 = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn9 = moduleMethod26;
        new ModuleMethod(frame4, 28, (Object) null, 0);
        lambda$Fn10 = moduleMethod27;
        new ModuleMethod(frame4, 29, (Object) null, 0);
        lambda$Fn11 = moduleMethod28;
        new ModuleMethod(frame4, 30, Lit112, 0);
        this.Card_View1$Click = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn12 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn13 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn14 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn15 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn16 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn17 = moduleMethod35;
        new ModuleMethod(frame4, 37, (Object) null, 0);
        lambda$Fn18 = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn19 = moduleMethod37;
        new ModuleMethod(frame4, 39, (Object) null, 0);
        lambda$Fn20 = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn21 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn22 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn23 = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn24 = moduleMethod42;
        new ModuleMethod(frame4, 44, (Object) null, 0);
        lambda$Fn25 = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn26 = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn27 = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn28 = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn29 = moduleMethod47;
        new ModuleMethod(frame4, 49, (Object) null, 0);
        lambda$Fn30 = moduleMethod48;
        new ModuleMethod(frame4, 50, (Object) null, 0);
        lambda$Fn31 = moduleMethod49;
        new ModuleMethod(frame4, 51, (Object) null, 0);
        lambda$Fn32 = moduleMethod50;
        new ModuleMethod(frame4, 52, (Object) null, 0);
        lambda$Fn33 = moduleMethod51;
        new ModuleMethod(frame4, 53, (Object) null, 0);
        lambda$Fn34 = moduleMethod52;
        new ModuleMethod(frame4, 54, (Object) null, 0);
        lambda$Fn35 = moduleMethod53;
        new ModuleMethod(frame4, 55, (Object) null, 0);
        lambda$Fn36 = moduleMethod54;
        new ModuleMethod(frame4, 56, (Object) null, 0);
        lambda$Fn37 = moduleMethod55;
        new ModuleMethod(frame4, 57, (Object) null, 0);
        lambda$Fn38 = moduleMethod56;
        new ModuleMethod(frame4, 58, (Object) null, 0);
        lambda$Fn39 = moduleMethod57;
        new ModuleMethod(frame4, 59, (Object) null, 0);
        lambda$Fn40 = moduleMethod58;
        new ModuleMethod(frame4, 60, (Object) null, 0);
        lambda$Fn41 = moduleMethod59;
        new ModuleMethod(frame4, 61, (Object) null, 0);
        lambda$Fn42 = moduleMethod60;
        new ModuleMethod(frame4, 62, (Object) null, 0);
        lambda$Fn43 = moduleMethod61;
        new ModuleMethod(frame4, 63, Lit188, 0);
        this.Card_View1_copy$Click = moduleMethod62;
        new ModuleMethod(frame4, 64, (Object) null, 0);
        lambda$Fn44 = moduleMethod63;
        new ModuleMethod(frame4, 65, (Object) null, 0);
        lambda$Fn45 = moduleMethod64;
        new ModuleMethod(frame4, 66, (Object) null, 0);
        lambda$Fn46 = moduleMethod65;
        new ModuleMethod(frame4, 67, (Object) null, 0);
        lambda$Fn47 = moduleMethod66;
        new ModuleMethod(frame4, 68, (Object) null, 0);
        lambda$Fn48 = moduleMethod67;
        new ModuleMethod(frame4, 69, (Object) null, 0);
        lambda$Fn49 = moduleMethod68;
        new ModuleMethod(frame4, 70, (Object) null, 0);
        lambda$Fn50 = moduleMethod69;
        new ModuleMethod(frame4, 71, (Object) null, 0);
        lambda$Fn51 = moduleMethod70;
        new ModuleMethod(frame4, 72, (Object) null, 0);
        lambda$Fn52 = moduleMethod71;
        new ModuleMethod(frame4, 73, (Object) null, 0);
        lambda$Fn53 = moduleMethod72;
        new ModuleMethod(frame4, 74, (Object) null, 0);
        lambda$Fn54 = moduleMethod73;
        new ModuleMethod(frame4, 75, (Object) null, 0);
        lambda$Fn55 = moduleMethod74;
        new ModuleMethod(frame4, 76, (Object) null, 0);
        lambda$Fn56 = moduleMethod75;
        new ModuleMethod(frame4, 77, (Object) null, 0);
        lambda$Fn57 = moduleMethod76;
        new ModuleMethod(frame4, 78, (Object) null, 0);
        lambda$Fn58 = moduleMethod77;
        new ModuleMethod(frame4, 79, (Object) null, 0);
        lambda$Fn59 = moduleMethod78;
        new ModuleMethod(frame4, 80, (Object) null, 0);
        lambda$Fn60 = moduleMethod79;
        new ModuleMethod(frame4, 81, (Object) null, 0);
        lambda$Fn61 = moduleMethod80;
        new ModuleMethod(frame4, 82, (Object) null, 0);
        lambda$Fn62 = moduleMethod81;
        new ModuleMethod(frame4, 83, (Object) null, 0);
        lambda$Fn63 = moduleMethod82;
        new ModuleMethod(frame4, 84, (Object) null, 0);
        lambda$Fn64 = moduleMethod83;
        new ModuleMethod(frame4, 85, (Object) null, 0);
        lambda$Fn65 = moduleMethod84;
        new ModuleMethod(frame4, 86, (Object) null, 0);
        lambda$Fn66 = moduleMethod85;
        new ModuleMethod(frame4, 87, (Object) null, 0);
        lambda$Fn67 = moduleMethod86;
        new ModuleMethod(frame4, 88, (Object) null, 0);
        lambda$Fn68 = moduleMethod87;
        new ModuleMethod(frame4, 89, (Object) null, 0);
        lambda$Fn69 = moduleMethod88;
        new ModuleMethod(frame4, 90, (Object) null, 0);
        lambda$Fn70 = moduleMethod89;
        new ModuleMethod(frame4, 91, (Object) null, 0);
        lambda$Fn71 = moduleMethod90;
        new ModuleMethod(frame4, 92, (Object) null, 0);
        lambda$Fn72 = moduleMethod91;
        new ModuleMethod(frame4, 93, (Object) null, 0);
        lambda$Fn73 = moduleMethod92;
        new ModuleMethod(frame4, 94, (Object) null, 0);
        lambda$Fn74 = moduleMethod93;
        new ModuleMethod(frame4, 95, (Object) null, 0);
        lambda$Fn75 = moduleMethod94;
        new ModuleMethod(frame4, 96, Lit252, 0);
        this.Card_View1_copy_copy$Click = moduleMethod95;
        new ModuleMethod(frame4, 97, (Object) null, 0);
        lambda$Fn76 = moduleMethod96;
        new ModuleMethod(frame4, 98, (Object) null, 0);
        lambda$Fn77 = moduleMethod97;
        new ModuleMethod(frame4, 99, (Object) null, 0);
        lambda$Fn78 = moduleMethod98;
        new ModuleMethod(frame4, 100, (Object) null, 0);
        lambda$Fn79 = moduleMethod99;
        new ModuleMethod(frame4, 101, (Object) null, 0);
        lambda$Fn80 = moduleMethod100;
        new ModuleMethod(frame4, 102, (Object) null, 0);
        lambda$Fn81 = moduleMethod101;
        new ModuleMethod(frame4, 103, (Object) null, 0);
        lambda$Fn82 = moduleMethod102;
        new ModuleMethod(frame4, 104, (Object) null, 0);
        lambda$Fn83 = moduleMethod103;
        new ModuleMethod(frame4, 105, (Object) null, 0);
        lambda$Fn84 = moduleMethod104;
        new ModuleMethod(frame4, 106, (Object) null, 0);
        lambda$Fn85 = moduleMethod105;
        new ModuleMethod(frame4, 107, (Object) null, 0);
        lambda$Fn86 = moduleMethod106;
        new ModuleMethod(frame4, 108, (Object) null, 0);
        lambda$Fn87 = moduleMethod107;
        new ModuleMethod(frame4, 109, (Object) null, 0);
        lambda$Fn88 = moduleMethod108;
        new ModuleMethod(frame4, 110, (Object) null, 0);
        lambda$Fn89 = moduleMethod109;
        new ModuleMethod(frame4, 111, (Object) null, 0);
        lambda$Fn90 = moduleMethod110;
        new ModuleMethod(frame4, 112, (Object) null, 0);
        lambda$Fn91 = moduleMethod111;
        new ModuleMethod(frame4, 113, (Object) null, 0);
        lambda$Fn92 = moduleMethod112;
        new ModuleMethod(frame4, 114, (Object) null, 0);
        lambda$Fn93 = moduleMethod113;
        new ModuleMethod(frame4, 115, (Object) null, 0);
        lambda$Fn94 = moduleMethod114;
        new ModuleMethod(frame4, 116, (Object) null, 0);
        lambda$Fn95 = moduleMethod115;
        new ModuleMethod(frame4, 117, (Object) null, 0);
        lambda$Fn96 = moduleMethod116;
        new ModuleMethod(frame4, 118, (Object) null, 0);
        lambda$Fn97 = moduleMethod117;
        new ModuleMethod(frame4, 119, (Object) null, 0);
        lambda$Fn98 = moduleMethod118;
        new ModuleMethod(frame4, 120, (Object) null, 0);
        lambda$Fn99 = moduleMethod119;
        new ModuleMethod(frame4, 121, (Object) null, 0);
        lambda$Fn100 = moduleMethod120;
        new ModuleMethod(frame4, 122, (Object) null, 0);
        lambda$Fn101 = moduleMethod121;
        new ModuleMethod(frame4, 123, (Object) null, 0);
        lambda$Fn102 = moduleMethod122;
        new ModuleMethod(frame4, 124, (Object) null, 0);
        lambda$Fn103 = moduleMethod123;
        new ModuleMethod(frame4, ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH, (Object) null, 0);
        lambda$Fn104 = moduleMethod124;
        new ModuleMethod(frame4, 126, (Object) null, 0);
        lambda$Fn105 = moduleMethod125;
        new ModuleMethod(frame4, 127, (Object) null, 0);
        lambda$Fn106 = moduleMethod126;
        new ModuleMethod(frame4, 128, (Object) null, 0);
        lambda$Fn107 = moduleMethod127;
        new ModuleMethod(frame4, 129, Lit316, 0);
        this.Card_View1_copy_copy_copy$Click = moduleMethod128;
        new ModuleMethod(frame4, 130, (Object) null, 0);
        lambda$Fn108 = moduleMethod129;
        new ModuleMethod(frame4, 131, (Object) null, 0);
        lambda$Fn109 = moduleMethod130;
        new ModuleMethod(frame4, 132, (Object) null, 0);
        lambda$Fn110 = moduleMethod131;
        new ModuleMethod(frame4, 133, (Object) null, 0);
        lambda$Fn111 = moduleMethod132;
        new ModuleMethod(frame4, 134, (Object) null, 0);
        lambda$Fn112 = moduleMethod133;
        new ModuleMethod(frame4, 135, (Object) null, 0);
        lambda$Fn113 = moduleMethod134;
        new ModuleMethod(frame4, 136, (Object) null, 0);
        lambda$Fn114 = moduleMethod135;
        new ModuleMethod(frame4, 137, (Object) null, 0);
        lambda$Fn115 = moduleMethod136;
        new ModuleMethod(frame4, 138, (Object) null, 0);
        lambda$Fn116 = moduleMethod137;
        new ModuleMethod(frame4, 139, (Object) null, 0);
        lambda$Fn117 = moduleMethod138;
        new ModuleMethod(frame4, 140, (Object) null, 0);
        lambda$Fn118 = moduleMethod139;
        new ModuleMethod(frame4, 141, (Object) null, 0);
        lambda$Fn119 = moduleMethod140;
        new ModuleMethod(frame4, 142, (Object) null, 0);
        lambda$Fn120 = moduleMethod141;
        new ModuleMethod(frame4, 143, (Object) null, 0);
        lambda$Fn121 = moduleMethod142;
        new ModuleMethod(frame4, 144, (Object) null, 0);
        lambda$Fn122 = moduleMethod143;
        new ModuleMethod(frame4, 145, (Object) null, 0);
        lambda$Fn123 = moduleMethod144;
        new ModuleMethod(frame4, 146, (Object) null, 0);
        lambda$Fn124 = moduleMethod145;
        new ModuleMethod(frame4, 147, (Object) null, 0);
        lambda$Fn125 = moduleMethod146;
        new ModuleMethod(frame4, 148, (Object) null, 0);
        lambda$Fn126 = moduleMethod147;
        new ModuleMethod(frame4, 149, (Object) null, 0);
        lambda$Fn127 = moduleMethod148;
        new ModuleMethod(frame4, 150, (Object) null, 0);
        lambda$Fn128 = moduleMethod149;
        new ModuleMethod(frame4, 151, (Object) null, 0);
        lambda$Fn129 = moduleMethod150;
        new ModuleMethod(frame4, 152, (Object) null, 0);
        lambda$Fn130 = moduleMethod151;
        new ModuleMethod(frame4, 153, (Object) null, 0);
        lambda$Fn131 = moduleMethod152;
        new ModuleMethod(frame4, 154, (Object) null, 0);
        lambda$Fn132 = moduleMethod153;
        new ModuleMethod(frame4, 155, (Object) null, 0);
        lambda$Fn133 = moduleMethod154;
        new ModuleMethod(frame4, 156, (Object) null, 0);
        lambda$Fn134 = moduleMethod155;
        new ModuleMethod(frame4, 157, (Object) null, 0);
        lambda$Fn135 = moduleMethod156;
        new ModuleMethod(frame4, 158, (Object) null, 0);
        lambda$Fn136 = moduleMethod157;
        new ModuleMethod(frame4, 159, (Object) null, 0);
        lambda$Fn137 = moduleMethod158;
        new ModuleMethod(frame4, ComponentConstants.TEXTBOX_PREFERRED_WIDTH, (Object) null, 0);
        lambda$Fn138 = moduleMethod159;
        new ModuleMethod(frame4, 161, (Object) null, 0);
        lambda$Fn139 = moduleMethod160;
        new ModuleMethod(frame4, 162, Lit381, 0);
        this.Card_View1_copy_copy_copy_copy$Click = moduleMethod161;
        new ModuleMethod(frame4, 163, (Object) null, 0);
        lambda$Fn140 = moduleMethod162;
        new ModuleMethod(frame4, 164, (Object) null, 0);
        lambda$Fn141 = moduleMethod163;
        new ModuleMethod(frame4, 165, (Object) null, 0);
        lambda$Fn142 = moduleMethod164;
        new ModuleMethod(frame4, 166, (Object) null, 0);
        lambda$Fn143 = moduleMethod165;
        new ModuleMethod(frame4, 167, (Object) null, 0);
        lambda$Fn144 = moduleMethod166;
        new ModuleMethod(frame4, 168, (Object) null, 0);
        lambda$Fn145 = moduleMethod167;
        new ModuleMethod(frame4, 169, (Object) null, 0);
        lambda$Fn146 = moduleMethod168;
        new ModuleMethod(frame4, 170, (Object) null, 0);
        lambda$Fn147 = moduleMethod169;
        new ModuleMethod(frame4, 171, (Object) null, 0);
        lambda$Fn148 = moduleMethod170;
        new ModuleMethod(frame4, 172, (Object) null, 0);
        lambda$Fn149 = moduleMethod171;
        new ModuleMethod(frame4, 173, (Object) null, 0);
        lambda$Fn150 = moduleMethod172;
        new ModuleMethod(frame4, 174, (Object) null, 0);
        lambda$Fn151 = moduleMethod173;
        new ModuleMethod(frame4, 175, (Object) null, 0);
        lambda$Fn152 = moduleMethod174;
        new ModuleMethod(frame4, 176, (Object) null, 0);
        lambda$Fn153 = moduleMethod175;
        new ModuleMethod(frame4, 177, (Object) null, 0);
        lambda$Fn154 = moduleMethod176;
        new ModuleMethod(frame4, 178, (Object) null, 0);
        lambda$Fn155 = moduleMethod177;
        new ModuleMethod(frame4, 179, (Object) null, 0);
        lambda$Fn156 = moduleMethod178;
        new ModuleMethod(frame4, 180, (Object) null, 0);
        lambda$Fn157 = moduleMethod179;
        new ModuleMethod(frame4, 181, (Object) null, 0);
        lambda$Fn158 = moduleMethod180;
        new ModuleMethod(frame4, 182, (Object) null, 0);
        lambda$Fn159 = moduleMethod181;
        new ModuleMethod(frame4, 183, (Object) null, 0);
        lambda$Fn160 = moduleMethod182;
        new ModuleMethod(frame4, 184, (Object) null, 0);
        lambda$Fn161 = moduleMethod183;
        new ModuleMethod(frame4, 185, (Object) null, 0);
        lambda$Fn162 = moduleMethod184;
        new ModuleMethod(frame4, 186, (Object) null, 0);
        lambda$Fn163 = moduleMethod185;
        new ModuleMethod(frame4, 187, (Object) null, 0);
        lambda$Fn164 = moduleMethod186;
        new ModuleMethod(frame4, 188, (Object) null, 0);
        lambda$Fn165 = moduleMethod187;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_DIALOG_FLAG, (Object) null, 0);
        lambda$Fn166 = moduleMethod188;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SEEK, (Object) null, 0);
        lambda$Fn167 = moduleMethod189;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_PLAY, (Object) null, 0);
        lambda$Fn168 = moduleMethod190;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_PAUSE, (Object) null, 0);
        lambda$Fn169 = moduleMethod191;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_STOP, (Object) null, 0);
        lambda$Fn170 = moduleMethod192;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SOURCE, (Object) null, 0);
        lambda$Fn171 = moduleMethod193;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_FULLSCREEN, Lit445, 0);
        this.Card_View1_copy_copy_copy_copy_copy$Click = moduleMethod194;
        new ModuleMethod(frame4, FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_DURATION, (Object) null, 0);
        lambda$Fn172 = moduleMethod195;
        new ModuleMethod(frame4, 197, (Object) null, 0);
        lambda$Fn173 = moduleMethod196;
        new ModuleMethod(frame4, 198, (Object) null, 0);
        lambda$Fn174 = moduleMethod197;
        new ModuleMethod(frame4, 199, (Object) null, 0);
        lambda$Fn175 = moduleMethod198;
        new ModuleMethod(frame4, 200, (Object) null, 0);
        lambda$Fn176 = moduleMethod199;
        new ModuleMethod(frame4, ErrorMessages.ERROR_CAMERA_NO_IMAGE_RETURNED, (Object) null, 0);
        lambda$Fn177 = moduleMethod200;
        new ModuleMethod(frame4, ErrorMessages.ERROR_NO_CAMERA_PERMISSION, (Object) null, 0);
        lambda$Fn178 = moduleMethod201;
        new ModuleMethod(frame4, 203, (Object) null, 0);
        lambda$Fn179 = moduleMethod202;
        new ModuleMethod(frame4, 204, (Object) null, 0);
        lambda$Fn180 = moduleMethod203;
        new ModuleMethod(frame4, 205, (Object) null, 0);
        lambda$Fn181 = moduleMethod204;
        new ModuleMethod(frame4, 206, (Object) null, 0);
        lambda$Fn182 = moduleMethod205;
        new ModuleMethod(frame4, 207, (Object) null, 0);
        lambda$Fn183 = moduleMethod206;
        new ModuleMethod(frame4, 208, (Object) null, 0);
        lambda$Fn184 = moduleMethod207;
        new ModuleMethod(frame4, 209, (Object) null, 0);
        lambda$Fn185 = moduleMethod208;
        new ModuleMethod(frame4, 210, (Object) null, 0);
        lambda$Fn186 = moduleMethod209;
        new ModuleMethod(frame4, 211, (Object) null, 0);
        lambda$Fn187 = moduleMethod210;
        new ModuleMethod(frame4, 212, (Object) null, 0);
        lambda$Fn188 = moduleMethod211;
        new ModuleMethod(frame4, 213, (Object) null, 0);
        lambda$Fn189 = moduleMethod212;
        new ModuleMethod(frame4, 214, (Object) null, 0);
        lambda$Fn190 = moduleMethod213;
        new ModuleMethod(frame4, 215, (Object) null, 0);
        lambda$Fn191 = moduleMethod214;
        new ModuleMethod(frame4, 216, (Object) null, 0);
        lambda$Fn192 = moduleMethod215;
        new ModuleMethod(frame4, 217, (Object) null, 0);
        lambda$Fn193 = moduleMethod216;
        new ModuleMethod(frame4, 218, (Object) null, 0);
        lambda$Fn194 = moduleMethod217;
        new ModuleMethod(frame4, 219, (Object) null, 0);
        lambda$Fn195 = moduleMethod218;
        new ModuleMethod(frame4, 220, (Object) null, 0);
        lambda$Fn196 = moduleMethod219;
        new ModuleMethod(frame4, 221, (Object) null, 0);
        lambda$Fn197 = moduleMethod220;
        new ModuleMethod(frame4, 222, (Object) null, 0);
        lambda$Fn198 = moduleMethod221;
        new ModuleMethod(frame4, 223, (Object) null, 0);
        lambda$Fn199 = moduleMethod222;
        new ModuleMethod(frame4, 224, (Object) null, 0);
        lambda$Fn200 = moduleMethod223;
        new ModuleMethod(frame4, 225, (Object) null, 0);
        lambda$Fn201 = moduleMethod224;
        new ModuleMethod(frame4, 226, (Object) null, 0);
        lambda$Fn202 = moduleMethod225;
        new ModuleMethod(frame4, 227, (Object) null, 0);
        lambda$Fn203 = moduleMethod226;
        new ModuleMethod(frame4, 228, Lit509, 0);
        this.Card_View1_copy_copy_copy_copy_copy_copy$Click = moduleMethod227;
        new ModuleMethod(frame4, 229, (Object) null, 0);
        lambda$Fn204 = moduleMethod228;
        new ModuleMethod(frame4, 230, (Object) null, 0);
        lambda$Fn205 = moduleMethod229;
        new ModuleMethod(frame4, 231, (Object) null, 0);
        lambda$Fn206 = moduleMethod230;
        new ModuleMethod(frame4, 232, (Object) null, 0);
        lambda$Fn207 = moduleMethod231;
        new ModuleMethod(frame4, 233, (Object) null, 0);
        lambda$Fn208 = moduleMethod232;
        new ModuleMethod(frame4, 234, (Object) null, 0);
        lambda$Fn209 = moduleMethod233;
        new ModuleMethod(frame4, 235, (Object) null, 0);
        lambda$Fn210 = moduleMethod234;
        new ModuleMethod(frame4, 236, (Object) null, 0);
        lambda$Fn211 = moduleMethod235;
        new ModuleMethod(frame4, 237, (Object) null, 0);
        lambda$Fn212 = moduleMethod236;
        new ModuleMethod(frame4, 238, (Object) null, 0);
        lambda$Fn213 = moduleMethod237;
        new ModuleMethod(frame4, 239, (Object) null, 0);
        lambda$Fn214 = moduleMethod238;
        new ModuleMethod(frame4, 240, (Object) null, 0);
        lambda$Fn215 = moduleMethod239;
        new ModuleMethod(frame4, 241, (Object) null, 0);
        lambda$Fn216 = moduleMethod240;
        new ModuleMethod(frame4, LispEscapeFormat.ESCAPE_ALL, (Object) null, 0);
        lambda$Fn217 = moduleMethod241;
        new ModuleMethod(frame4, 243, (Object) null, 0);
        lambda$Fn218 = moduleMethod242;
        new ModuleMethod(frame4, 244, (Object) null, 0);
        lambda$Fn219 = moduleMethod243;
        new ModuleMethod(frame4, 245, (Object) null, 0);
        lambda$Fn220 = moduleMethod244;
        new ModuleMethod(frame4, 246, (Object) null, 0);
        lambda$Fn221 = moduleMethod245;
        new ModuleMethod(frame4, 247, (Object) null, 0);
        lambda$Fn222 = moduleMethod246;
        new ModuleMethod(frame4, ComponentConstants.LISTVIEW_PREFERRED_WIDTH, (Object) null, 0);
        lambda$Fn223 = moduleMethod247;
        new ModuleMethod(frame4, 249, (Object) null, 0);
        lambda$Fn224 = moduleMethod248;
        new ModuleMethod(frame4, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (Object) null, 0);
        lambda$Fn225 = moduleMethod249;
        new ModuleMethod(frame4, Telnet.WILL, (Object) null, 0);
        lambda$Fn226 = moduleMethod250;
        new ModuleMethod(frame4, Telnet.WONT, (Object) null, 0);
        lambda$Fn227 = moduleMethod251;
        new ModuleMethod(frame4, Telnet.f258DO, (Object) null, 0);
        lambda$Fn228 = moduleMethod252;
        new ModuleMethod(frame4, Telnet.DONT, (Object) null, 0);
        lambda$Fn229 = moduleMethod253;
        new ModuleMethod(frame4, 255, (Object) null, 0);
        lambda$Fn230 = moduleMethod254;
        new ModuleMethod(frame4, 256, (Object) null, 0);
        lambda$Fn231 = moduleMethod255;
        new ModuleMethod(frame4, InputDeviceCompat.SOURCE_KEYBOARD, (Object) null, 0);
        lambda$Fn232 = moduleMethod256;
        new ModuleMethod(frame4, 258, (Object) null, 0);
        lambda$Fn233 = moduleMethod257;
        new ModuleMethod(frame4, 259, (Object) null, 0);
        lambda$Fn234 = moduleMethod258;
        new ModuleMethod(frame4, 260, (Object) null, 0);
        lambda$Fn235 = moduleMethod259;
        new ModuleMethod(frame4, 261, Lit574, 0);
        this.Card_View1_copy_copy_copy_copy_copy_copy_copy$Click = moduleMethod260;
        new ModuleMethod(frame4, 262, (Object) null, 0);
        lambda$Fn236 = moduleMethod261;
        new ModuleMethod(frame4, 263, (Object) null, 0);
        lambda$Fn237 = moduleMethod262;
        new ModuleMethod(frame4, 264, (Object) null, 0);
        lambda$Fn238 = moduleMethod263;
        new ModuleMethod(frame4, 265, (Object) null, 0);
        lambda$Fn239 = moduleMethod264;
        new ModuleMethod(frame4, 266, (Object) null, 0);
        lambda$Fn240 = moduleMethod265;
        new ModuleMethod(frame4, 267, (Object) null, 0);
        lambda$Fn241 = moduleMethod266;
        new ModuleMethod(frame4, 268, (Object) null, 0);
        lambda$Fn242 = moduleMethod267;
        new ModuleMethod(frame4, 269, (Object) null, 0);
        lambda$Fn243 = moduleMethod268;
        new ModuleMethod(frame4, 270, (Object) null, 0);
        lambda$Fn244 = moduleMethod269;
        new ModuleMethod(frame4, 271, (Object) null, 0);
        lambda$Fn245 = moduleMethod270;
        new ModuleMethod(frame4, 272, (Object) null, 0);
        lambda$Fn246 = moduleMethod271;
        new ModuleMethod(frame4, 273, (Object) null, 0);
        lambda$Fn247 = moduleMethod272;
        new ModuleMethod(frame4, 274, (Object) null, 0);
        lambda$Fn248 = moduleMethod273;
        new ModuleMethod(frame4, 275, (Object) null, 0);
        lambda$Fn249 = moduleMethod274;
        new ModuleMethod(frame4, 276, (Object) null, 0);
        lambda$Fn250 = moduleMethod275;
        new ModuleMethod(frame4, 277, (Object) null, 0);
        lambda$Fn251 = moduleMethod276;
        new ModuleMethod(frame4, 278, (Object) null, 0);
        lambda$Fn252 = moduleMethod277;
        new ModuleMethod(frame4, 279, (Object) null, 0);
        lambda$Fn253 = moduleMethod278;
        new ModuleMethod(frame4, 280, (Object) null, 0);
        lambda$Fn254 = moduleMethod279;
        new ModuleMethod(frame4, 281, (Object) null, 0);
        lambda$Fn255 = moduleMethod280;
        new ModuleMethod(frame4, 282, (Object) null, 0);
        lambda$Fn256 = moduleMethod281;
        new ModuleMethod(frame4, 283, (Object) null, 0);
        lambda$Fn257 = moduleMethod282;
        new ModuleMethod(frame4, 284, (Object) null, 0);
        lambda$Fn258 = moduleMethod283;
        new ModuleMethod(frame4, 285, (Object) null, 0);
        lambda$Fn259 = moduleMethod284;
        new ModuleMethod(frame4, 286, (Object) null, 0);
        lambda$Fn260 = moduleMethod285;
        new ModuleMethod(frame4, 287, (Object) null, 0);
        lambda$Fn261 = moduleMethod286;
        new ModuleMethod(frame4, 288, (Object) null, 0);
        lambda$Fn262 = moduleMethod287;
        new ModuleMethod(frame4, 289, (Object) null, 0);
        lambda$Fn263 = moduleMethod288;
        new ModuleMethod(frame4, 290, Lit631, 0);
        this.Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click = moduleMethod289;
        new ModuleMethod(frame4, 291, (Object) null, 0);
        lambda$Fn264 = moduleMethod290;
        new ModuleMethod(frame4, 292, (Object) null, 0);
        lambda$Fn265 = moduleMethod291;
        new ModuleMethod(frame4, 293, (Object) null, 0);
        lambda$Fn266 = moduleMethod292;
        new ModuleMethod(frame4, 294, (Object) null, 0);
        lambda$Fn267 = moduleMethod293;
        new ModuleMethod(frame4, 295, (Object) null, 0);
        lambda$Fn268 = moduleMethod294;
        new ModuleMethod(frame4, 296, (Object) null, 0);
        lambda$Fn269 = moduleMethod295;
        new ModuleMethod(frame4, 297, (Object) null, 0);
        lambda$Fn270 = moduleMethod296;
        new ModuleMethod(frame4, 298, (Object) null, 0);
        lambda$Fn271 = moduleMethod297;
        new ModuleMethod(frame4, 299, (Object) null, 0);
        lambda$Fn272 = moduleMethod298;
        new ModuleMethod(frame4, 300, (Object) null, 0);
        lambda$Fn273 = moduleMethod299;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION, (Object) null, 0);
        lambda$Fn274 = moduleMethod300;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET, (Object) null, 0);
        lambda$Fn275 = moduleMethod301;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_EXCEPTION, (Object) null, 0);
        lambda$Fn276 = moduleMethod302;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN, (Object) null, 0);
        lambda$Fn277 = moduleMethod303;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_AUTHORIZATION_FAILED, (Object) null, 0);
        lambda$Fn278 = moduleMethod304;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_SET_STATUS_FAILED, (Object) null, 0);
        lambda$Fn279 = moduleMethod305;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_REQUEST_MENTIONS_FAILED, (Object) null, 0);
        lambda$Fn280 = moduleMethod306;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED, (Object) null, 0);
        lambda$Fn281 = moduleMethod307;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED, (Object) null, 0);
        lambda$Fn282 = moduleMethod308;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_DIRECT_MESSAGE_FAILED, (Object) null, 0);
        lambda$Fn283 = moduleMethod309;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_FOLLOW_FAILED, (Object) null, 0);
        lambda$Fn284 = moduleMethod310;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_STOP_FOLLOWING_FAILED, (Object) null, 0);
        lambda$Fn285 = moduleMethod311;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED, (Object) null, 0);
        lambda$Fn286 = moduleMethod312;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_SEARCH_FAILED, (Object) null, 0);
        lambda$Fn287 = moduleMethod313;
        new ModuleMethod(frame4, ErrorMessages.ERROR_TWITTER_INVALID_IMAGE_PATH, (Object) null, 0);
        lambda$Fn288 = moduleMethod314;
        new ModuleMethod(frame4, 316, (Object) null, 0);
        lambda$Fn289 = moduleMethod315;
        new ModuleMethod(frame4, 317, Lit686, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dolarAlis$GotElements = moduleMethod316;
        new ModuleMethod(frame4, 318, Lit692, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dolarSatis$GotElements = moduleMethod317;
        new ModuleMethod(frame4, 319, Lit697, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.euroAlis$GotElements = moduleMethod318;
        new ModuleMethod(frame4, ScreenDensityUtil.DEFAULT_NORMAL_SHORT_DIMENSION, Lit702, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.euroSatis$GotElements = moduleMethod319;
        new ModuleMethod(frame4, 321, (Object) null, 0);
        lambda$Fn290 = moduleMethod320;
        new ModuleMethod(frame4, 322, (Object) null, 0);
        lambda$Fn291 = moduleMethod321;
        new ModuleMethod(frame4, 323, Lit724, 0);
        this.Clock1$Timer = moduleMethod322;
        new ModuleMethod(frame4, 324, Lit730, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.sterlinAlis$GotElements = moduleMethod323;
        new ModuleMethod(frame4, 325, Lit735, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.sterlinSatis$GotElements = moduleMethod324;
        new ModuleMethod(frame4, 326, Lit740, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.canadaAlis$GotElements = moduleMethod325;
        new ModuleMethod(frame4, 327, Lit745, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.canadaSatis$GotElements = moduleMethod326;
        new ModuleMethod(frame4, 328, Lit750, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.rubleAlis$GotElements = moduleMethod327;
        new ModuleMethod(frame4, 329, Lit755, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.rubleSatis$GotElements = moduleMethod328;
        new ModuleMethod(frame4, 330, Lit760, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.jpyAlis$GotElements = moduleMethod329;
        new ModuleMethod(frame4, 331, Lit765, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.jpySatis$GotElements = moduleMethod330;
        new ModuleMethod(frame4, 332, Lit770, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.wonAlis$GotElements = moduleMethod331;
        new ModuleMethod(frame4, 333, Lit775, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.wonSatis$GotElements = moduleMethod332;
        new ModuleMethod(frame4, 334, Lit783, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.btcAlis$GotElements = moduleMethod333;
        new ModuleMethod(frame4, 335, Lit788, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.ethAlis$GotElements = moduleMethod334;
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
        String obj;
        Object obj2;
        Consumer $result = $ctx.consumer;
        C1171runtime.$instance.run();
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
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C1171runtime.$instance.run();
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn3);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit53, "", Lit54);
            Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit55, Lit56, Lit57);
            Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit58, Lit59, Lit57);
            Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit60, Lit61, Lit57);
            Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit62, "6745161059008512", Lit54);
            Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit63, "dovizcevirici", Lit54);
            Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit64, Lit65, Lit57);
            Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit66, Lit67, Lit57);
            Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit68, Lit69, Lit57);
            Object andCoerceProperty$Ex10 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit70, Lit71, Lit57);
            Object andCoerceProperty$Ex11 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit72, AlgorithmIdentifiers.NONE, Lit54);
            Object andCoerceProperty$Ex12 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit73, Boolean.TRUE, Lit74);
            Object andCoerceProperty$Ex13 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit75, Boolean.FALSE, Lit74);
            Object andCoerceProperty$Ex14 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit76, Boolean.FALSE, Lit74);
            Object andCoerceProperty$Ex15 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit77, "None", Lit54);
            Object andCoerceProperty$Ex16 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit78, "Döviz Çevirici", Lit54);
            Object andCoerceProperty$Ex17 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit79, Lit80, Lit57);
            Values.writeValues(C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit81, "Ana Sayfa", Lit54), $result);
        } else {
            new Promise(lambda$Fn5);
            addToFormDoAfterCreation(obj2);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1171runtime.addToCurrentFormEnvironment(Lit82, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit82, this.Screen1$Initialize);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit83);
        }
        this.Vertical_Scroll_Arrangement1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit84, Lit85, lambda$Fn6), $result);
        } else {
            addToComponents(Lit0, Lit89, Lit85, lambda$Fn7);
        }
        this.Image1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit90, Lit91, lambda$Fn8), $result);
        } else {
            addToComponents(Lit85, Lit95, Lit91, lambda$Fn9);
        }
        this.Card_View1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit96, Lit97, lambda$Fn10), $result);
        } else {
            addToComponents(Lit85, Lit110, Lit97, lambda$Fn11);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment2 = C1171runtime.addToCurrentFormEnvironment(Lit112, this.Card_View1$Click);
        } else {
            addToFormEnvironment(Lit112, this.Card_View1$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1", "Click");
        } else {
            addToEvents(Lit97, Lit113);
        }
        this.Horizontal_Arrangement1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit97, Lit114, Lit115, lambda$Fn12), $result);
        } else {
            addToComponents(Lit97, Lit116, Lit115, lambda$Fn13);
        }
        this.Space1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit115, Lit117, Lit118, lambda$Fn14), $result);
        } else {
            addToComponents(Lit115, Lit120, Lit118, lambda$Fn15);
        }
        this.Label1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit115, Lit121, Lit122, lambda$Fn16), $result);
        } else {
            addToComponents(Lit115, Lit131, Lit122, lambda$Fn17);
        }
        this.Space3 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit115, Lit132, Lit133, lambda$Fn18), $result);
        } else {
            addToComponents(Lit115, Lit135, Lit133, lambda$Fn19);
        }
        this.Horizontal_Arrangement2 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit115, Lit136, Lit137, lambda$Fn20), $result);
        } else {
            addToComponents(Lit115, Lit138, Lit137, lambda$Fn21);
        }
        this.Vertical_Arrangement1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit137, Lit139, Lit140, lambda$Fn22), $result);
        } else {
            addToComponents(Lit137, Lit141, Lit140, lambda$Fn23);
        }
        this.Label2 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit140, Lit142, Lit143, lambda$Fn24), $result);
        } else {
            addToComponents(Lit140, Lit147, Lit143, lambda$Fn25);
        }
        this.Label3 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit140, Lit148, Lit149, lambda$Fn26), $result);
        } else {
            addToComponents(Lit140, Lit152, Lit149, lambda$Fn27);
        }
        this.Vertical_Arrangement3 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit137, Lit153, Lit154, lambda$Fn28), $result);
        } else {
            addToComponents(Lit137, Lit155, Lit154, lambda$Fn29);
        }
        this.Label4 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit154, Lit156, Lit157, lambda$Fn30), $result);
        } else {
            addToComponents(Lit154, Lit160, Lit157, lambda$Fn31);
        }
        this.DolarAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit154, Lit161, Lit162, lambda$Fn32), $result);
        } else {
            addToComponents(Lit154, Lit164, Lit162, lambda$Fn33);
        }
        this.Vertical_Arrangement2 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit137, Lit165, Lit166, lambda$Fn34), $result);
        } else {
            addToComponents(Lit137, Lit167, Lit166, lambda$Fn35);
        }
        this.Label6 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit166, Lit168, Lit169, lambda$Fn36), $result);
        } else {
            addToComponents(Lit166, Lit171, Lit169, lambda$Fn37);
        }
        this.DolarSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit166, Lit172, Lit173, lambda$Fn38), $result);
        } else {
            addToComponents(Lit166, Lit175, Lit173, lambda$Fn39);
        }
        this.Space2 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit115, Lit176, Lit177, lambda$Fn40), $result);
        } else {
            addToComponents(Lit115, Lit179, Lit177, lambda$Fn41);
        }
        this.Card_View1_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit180, Lit181, lambda$Fn42), $result);
        } else {
            addToComponents(Lit85, Lit186, Lit181, lambda$Fn43);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment3 = C1171runtime.addToCurrentFormEnvironment(Lit188, this.Card_View1_copy$Click);
        } else {
            addToFormEnvironment(Lit188, this.Card_View1_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy", "Click");
        } else {
            addToEvents(Lit181, Lit113);
        }
        this.Horizontal_Arrangement1_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit181, Lit189, Lit190, lambda$Fn44), $result);
        } else {
            addToComponents(Lit181, Lit191, Lit190, lambda$Fn45);
        }
        this.Space1_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit190, Lit192, Lit193, lambda$Fn46), $result);
        } else {
            addToComponents(Lit190, Lit195, Lit193, lambda$Fn47);
        }
        this.Label1_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit190, Lit196, Lit197, lambda$Fn48), $result);
        } else {
            addToComponents(Lit190, Lit199, Lit197, lambda$Fn49);
        }
        this.Space3_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit190, Lit200, Lit201, lambda$Fn50), $result);
        } else {
            addToComponents(Lit190, Lit203, Lit201, lambda$Fn51);
        }
        this.Horizontal_Arrangement2_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit190, Lit204, Lit205, lambda$Fn52), $result);
        } else {
            addToComponents(Lit190, Lit206, Lit205, lambda$Fn53);
        }
        this.Vertical_Arrangement1_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit205, Lit207, Lit208, lambda$Fn54), $result);
        } else {
            addToComponents(Lit205, Lit209, Lit208, lambda$Fn55);
        }
        this.Label2_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit208, Lit210, Lit211, lambda$Fn56), $result);
        } else {
            addToComponents(Lit208, Lit213, Lit211, lambda$Fn57);
        }
        this.Label3_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit208, Lit214, Lit215, lambda$Fn58), $result);
        } else {
            addToComponents(Lit208, Lit217, Lit215, lambda$Fn59);
        }
        this.Vertical_Arrangement3_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit205, Lit218, Lit219, lambda$Fn60), $result);
        } else {
            addToComponents(Lit205, Lit220, Lit219, lambda$Fn61);
        }
        this.Label4_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit219, Lit221, Lit222, lambda$Fn62), $result);
        } else {
            addToComponents(Lit219, Lit224, Lit222, lambda$Fn63);
        }
        this.EuroAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit219, Lit225, Lit226, lambda$Fn64), $result);
        } else {
            addToComponents(Lit219, Lit228, Lit226, lambda$Fn65);
        }
        this.Vertical_Arrangement2_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit205, Lit229, Lit230, lambda$Fn66), $result);
        } else {
            addToComponents(Lit205, Lit231, Lit230, lambda$Fn67);
        }
        this.Label6_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit230, Lit232, Lit233, lambda$Fn68), $result);
        } else {
            addToComponents(Lit230, Lit235, Lit233, lambda$Fn69);
        }
        this.EuroSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit230, Lit236, Lit237, lambda$Fn70), $result);
        } else {
            addToComponents(Lit230, Lit239, Lit237, lambda$Fn71);
        }
        this.Space2_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit190, Lit240, Lit241, lambda$Fn72), $result);
        } else {
            addToComponents(Lit190, Lit243, Lit241, lambda$Fn73);
        }
        this.Card_View1_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit244, Lit245, lambda$Fn74), $result);
        } else {
            addToComponents(Lit85, Lit250, Lit245, lambda$Fn75);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment4 = C1171runtime.addToCurrentFormEnvironment(Lit252, this.Card_View1_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit252, this.Card_View1_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy", "Click");
        } else {
            addToEvents(Lit245, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit245, Lit253, Lit254, lambda$Fn76), $result);
        } else {
            addToComponents(Lit245, Lit255, Lit254, lambda$Fn77);
        }
        this.Space1_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit254, Lit256, Lit257, lambda$Fn78), $result);
        } else {
            addToComponents(Lit254, Lit259, Lit257, lambda$Fn79);
        }
        this.Label1_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit254, Lit260, Lit261, lambda$Fn80), $result);
        } else {
            addToComponents(Lit254, Lit263, Lit261, lambda$Fn81);
        }
        this.Space3_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit254, Lit264, Lit265, lambda$Fn82), $result);
        } else {
            addToComponents(Lit254, Lit267, Lit265, lambda$Fn83);
        }
        this.Horizontal_Arrangement2_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit254, Lit268, Lit269, lambda$Fn84), $result);
        } else {
            addToComponents(Lit254, Lit270, Lit269, lambda$Fn85);
        }
        this.Vertical_Arrangement1_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit269, Lit271, Lit272, lambda$Fn86), $result);
        } else {
            addToComponents(Lit269, Lit273, Lit272, lambda$Fn87);
        }
        this.Label2_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit272, Lit274, Lit275, lambda$Fn88), $result);
        } else {
            addToComponents(Lit272, Lit277, Lit275, lambda$Fn89);
        }
        this.labelll = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit272, Lit278, Lit279, lambda$Fn90), $result);
        } else {
            addToComponents(Lit272, Lit281, Lit279, lambda$Fn91);
        }
        this.Vertical_Arrangement3_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit269, Lit282, Lit283, lambda$Fn92), $result);
        } else {
            addToComponents(Lit269, Lit284, Lit283, lambda$Fn93);
        }
        this.Label4_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit283, Lit285, Lit286, lambda$Fn94), $result);
        } else {
            addToComponents(Lit283, Lit288, Lit286, lambda$Fn95);
        }
        this.SterlinAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit283, Lit289, Lit290, lambda$Fn96), $result);
        } else {
            addToComponents(Lit283, Lit292, Lit290, lambda$Fn97);
        }
        this.Vertical_Arrangement2_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit269, Lit293, Lit294, lambda$Fn98), $result);
        } else {
            addToComponents(Lit269, Lit295, Lit294, lambda$Fn99);
        }
        this.Label6_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit294, Lit296, Lit297, lambda$Fn100), $result);
        } else {
            addToComponents(Lit294, Lit299, Lit297, lambda$Fn101);
        }
        this.SterlinSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit294, Lit300, Lit301, lambda$Fn102), $result);
        } else {
            addToComponents(Lit294, Lit303, Lit301, lambda$Fn103);
        }
        this.Space2_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit254, Lit304, Lit305, lambda$Fn104), $result);
        } else {
            addToComponents(Lit254, Lit307, Lit305, lambda$Fn105);
        }
        this.Card_View1_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit308, Lit309, lambda$Fn106), $result);
        } else {
            addToComponents(Lit85, Lit314, Lit309, lambda$Fn107);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment5 = C1171runtime.addToCurrentFormEnvironment(Lit316, this.Card_View1_copy_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit316, this.Card_View1_copy_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy_copy", "Click");
        } else {
            addToEvents(Lit309, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit309, Lit317, Lit318, lambda$Fn108), $result);
        } else {
            addToComponents(Lit309, Lit319, Lit318, lambda$Fn109);
        }
        this.Space1_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit318, Lit320, Lit321, lambda$Fn110), $result);
        } else {
            addToComponents(Lit318, Lit323, Lit321, lambda$Fn111);
        }
        this.Label1_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit318, Lit324, Lit325, lambda$Fn112), $result);
        } else {
            addToComponents(Lit318, Lit328, Lit325, lambda$Fn113);
        }
        this.Space3_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit318, Lit329, Lit330, lambda$Fn114), $result);
        } else {
            addToComponents(Lit318, Lit332, Lit330, lambda$Fn115);
        }
        this.Horizontal_Arrangement2_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit318, Lit333, Lit334, lambda$Fn116), $result);
        } else {
            addToComponents(Lit318, Lit335, Lit334, lambda$Fn117);
        }
        this.Vertical_Arrangement1_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit334, Lit336, Lit337, lambda$Fn118), $result);
        } else {
            addToComponents(Lit334, Lit338, Lit337, lambda$Fn119);
        }
        this.Label2_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit337, Lit339, Lit340, lambda$Fn120), $result);
        } else {
            addToComponents(Lit337, Lit342, Lit340, lambda$Fn121);
        }
        this.Label3_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit337, Lit343, Lit344, lambda$Fn122), $result);
        } else {
            addToComponents(Lit337, Lit346, Lit344, lambda$Fn123);
        }
        this.Vertical_Arrangement3_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit334, Lit347, Lit348, lambda$Fn124), $result);
        } else {
            addToComponents(Lit334, Lit349, Lit348, lambda$Fn125);
        }
        this.Label4_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit348, Lit350, Lit351, lambda$Fn126), $result);
        } else {
            addToComponents(Lit348, Lit353, Lit351, lambda$Fn127);
        }
        this.CanadaAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit348, Lit354, Lit355, lambda$Fn128), $result);
        } else {
            addToComponents(Lit348, Lit357, Lit355, lambda$Fn129);
        }
        this.Vertical_Arrangement2_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit334, Lit358, Lit359, lambda$Fn130), $result);
        } else {
            addToComponents(Lit334, Lit360, Lit359, lambda$Fn131);
        }
        this.Label6_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit359, Lit361, Lit362, lambda$Fn132), $result);
        } else {
            addToComponents(Lit359, Lit364, Lit362, lambda$Fn133);
        }
        this.CanadaSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit359, Lit365, Lit366, lambda$Fn134), $result);
        } else {
            addToComponents(Lit359, Lit368, Lit366, lambda$Fn135);
        }
        this.Space2_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit318, Lit369, Lit370, lambda$Fn136), $result);
        } else {
            addToComponents(Lit318, Lit372, Lit370, lambda$Fn137);
        }
        this.Card_View1_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit373, Lit374, lambda$Fn138), $result);
        } else {
            addToComponents(Lit85, Lit379, Lit374, lambda$Fn139);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment6 = C1171runtime.addToCurrentFormEnvironment(Lit381, this.Card_View1_copy_copy_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit381, this.Card_View1_copy_copy_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy_copy_copy", "Click");
        } else {
            addToEvents(Lit374, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit374, Lit382, Lit383, lambda$Fn140), $result);
        } else {
            addToComponents(Lit374, Lit384, Lit383, lambda$Fn141);
        }
        this.Space1_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit383, Lit385, Lit386, lambda$Fn142), $result);
        } else {
            addToComponents(Lit383, Lit388, Lit386, lambda$Fn143);
        }
        this.Label1_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit383, Lit389, Lit390, lambda$Fn144), $result);
        } else {
            addToComponents(Lit383, Lit392, Lit390, lambda$Fn145);
        }
        this.Space3_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit383, Lit393, Lit394, lambda$Fn146), $result);
        } else {
            addToComponents(Lit383, Lit396, Lit394, lambda$Fn147);
        }
        this.Horizontal_Arrangement2_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit383, Lit397, Lit398, lambda$Fn148), $result);
        } else {
            addToComponents(Lit383, Lit399, Lit398, lambda$Fn149);
        }
        this.Vertical_Arrangement1_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit398, Lit400, Lit401, lambda$Fn150), $result);
        } else {
            addToComponents(Lit398, Lit402, Lit401, lambda$Fn151);
        }
        this.Label2_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit401, Lit403, Lit404, lambda$Fn152), $result);
        } else {
            addToComponents(Lit401, Lit406, Lit404, lambda$Fn153);
        }
        this.Label3_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit401, Lit407, Lit408, lambda$Fn154), $result);
        } else {
            addToComponents(Lit401, Lit410, Lit408, lambda$Fn155);
        }
        this.Vertical_Arrangement3_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit398, Lit411, Lit412, lambda$Fn156), $result);
        } else {
            addToComponents(Lit398, Lit413, Lit412, lambda$Fn157);
        }
        this.Label4_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit412, Lit414, Lit415, lambda$Fn158), $result);
        } else {
            addToComponents(Lit412, Lit417, Lit415, lambda$Fn159);
        }
        this.RubleAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit412, Lit418, Lit419, lambda$Fn160), $result);
        } else {
            addToComponents(Lit412, Lit421, Lit419, lambda$Fn161);
        }
        this.Vertical_Arrangement2_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit398, Lit422, Lit423, lambda$Fn162), $result);
        } else {
            addToComponents(Lit398, Lit424, Lit423, lambda$Fn163);
        }
        this.Label6_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit423, Lit425, Lit426, lambda$Fn164), $result);
        } else {
            addToComponents(Lit423, Lit428, Lit426, lambda$Fn165);
        }
        this.RubleSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit423, Lit429, Lit430, lambda$Fn166), $result);
        } else {
            addToComponents(Lit423, Lit432, Lit430, lambda$Fn167);
        }
        this.Space2_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit383, Lit433, Lit434, lambda$Fn168), $result);
        } else {
            addToComponents(Lit383, Lit436, Lit434, lambda$Fn169);
        }
        this.Card_View1_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit437, Lit438, lambda$Fn170), $result);
        } else {
            addToComponents(Lit85, Lit443, Lit438, lambda$Fn171);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment7 = C1171runtime.addToCurrentFormEnvironment(Lit445, this.Card_View1_copy_copy_copy_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit445, this.Card_View1_copy_copy_copy_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy_copy_copy_copy", "Click");
        } else {
            addToEvents(Lit438, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit438, Lit446, Lit447, lambda$Fn172), $result);
        } else {
            addToComponents(Lit438, Lit448, Lit447, lambda$Fn173);
        }
        this.Space1_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit447, Lit449, Lit450, lambda$Fn174), $result);
        } else {
            addToComponents(Lit447, Lit452, Lit450, lambda$Fn175);
        }
        this.Label1_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit447, Lit453, Lit454, lambda$Fn176), $result);
        } else {
            addToComponents(Lit447, Lit456, Lit454, lambda$Fn177);
        }
        this.Space3_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit447, Lit457, Lit458, lambda$Fn178), $result);
        } else {
            addToComponents(Lit447, Lit460, Lit458, lambda$Fn179);
        }
        this.Horizontal_Arrangement2_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit447, Lit461, Lit462, lambda$Fn180), $result);
        } else {
            addToComponents(Lit447, Lit463, Lit462, lambda$Fn181);
        }
        this.Vertical_Arrangement1_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit462, Lit464, Lit465, lambda$Fn182), $result);
        } else {
            addToComponents(Lit462, Lit466, Lit465, lambda$Fn183);
        }
        this.Label2_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit465, Lit467, Lit468, lambda$Fn184), $result);
        } else {
            addToComponents(Lit465, Lit470, Lit468, lambda$Fn185);
        }
        this.Label3_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit465, Lit471, Lit472, lambda$Fn186), $result);
        } else {
            addToComponents(Lit465, Lit474, Lit472, lambda$Fn187);
        }
        this.Vertical_Arrangement3_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit462, Lit475, Lit476, lambda$Fn188), $result);
        } else {
            addToComponents(Lit462, Lit477, Lit476, lambda$Fn189);
        }
        this.Label4_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit476, Lit478, Lit479, lambda$Fn190), $result);
        } else {
            addToComponents(Lit476, Lit481, Lit479, lambda$Fn191);
        }
        this.JpyAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit476, Lit482, Lit483, lambda$Fn192), $result);
        } else {
            addToComponents(Lit476, Lit485, Lit483, lambda$Fn193);
        }
        this.Vertical_Arrangement2_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit462, Lit486, Lit487, lambda$Fn194), $result);
        } else {
            addToComponents(Lit462, Lit488, Lit487, lambda$Fn195);
        }
        this.Label6_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit487, Lit489, Lit490, lambda$Fn196), $result);
        } else {
            addToComponents(Lit487, Lit492, Lit490, lambda$Fn197);
        }
        this.JpySatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit487, Lit493, Lit494, lambda$Fn198), $result);
        } else {
            addToComponents(Lit487, Lit496, Lit494, lambda$Fn199);
        }
        this.Space2_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit447, Lit497, Lit498, lambda$Fn200), $result);
        } else {
            addToComponents(Lit447, Lit500, Lit498, lambda$Fn201);
        }
        this.Card_View1_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit501, Lit502, lambda$Fn202), $result);
        } else {
            addToComponents(Lit85, Lit507, Lit502, lambda$Fn203);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment8 = C1171runtime.addToCurrentFormEnvironment(Lit509, this.Card_View1_copy_copy_copy_copy_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit509, this.Card_View1_copy_copy_copy_copy_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy_copy_copy_copy_copy", "Click");
        } else {
            addToEvents(Lit502, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit502, Lit510, Lit511, lambda$Fn204), $result);
        } else {
            addToComponents(Lit502, Lit512, Lit511, lambda$Fn205);
        }
        this.Space1_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit511, Lit513, Lit514, lambda$Fn206), $result);
        } else {
            addToComponents(Lit511, Lit516, Lit514, lambda$Fn207);
        }
        this.Label1_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit511, Lit517, Lit518, lambda$Fn208), $result);
        } else {
            addToComponents(Lit511, Lit521, Lit518, lambda$Fn209);
        }
        this.Space3_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit511, Lit522, Lit523, lambda$Fn210), $result);
        } else {
            addToComponents(Lit511, Lit525, Lit523, lambda$Fn211);
        }
        this.Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit511, Lit526, Lit527, lambda$Fn212), $result);
        } else {
            addToComponents(Lit511, Lit528, Lit527, lambda$Fn213);
        }
        this.Vertical_Arrangement1_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit527, Lit529, Lit530, lambda$Fn214), $result);
        } else {
            addToComponents(Lit527, Lit531, Lit530, lambda$Fn215);
        }
        this.Label2_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit530, Lit532, Lit533, lambda$Fn216), $result);
        } else {
            addToComponents(Lit530, Lit535, Lit533, lambda$Fn217);
        }
        this.Label3_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit530, Lit536, Lit537, lambda$Fn218), $result);
        } else {
            addToComponents(Lit530, Lit539, Lit537, lambda$Fn219);
        }
        this.Vertical_Arrangement3_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit527, Lit540, Lit541, lambda$Fn220), $result);
        } else {
            addToComponents(Lit527, Lit542, Lit541, lambda$Fn221);
        }
        this.Label4_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit541, Lit543, Lit544, lambda$Fn222), $result);
        } else {
            addToComponents(Lit541, Lit546, Lit544, lambda$Fn223);
        }
        this.WonAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit541, Lit547, Lit548, lambda$Fn224), $result);
        } else {
            addToComponents(Lit541, Lit550, Lit548, lambda$Fn225);
        }
        this.Vertical_Arrangement2_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit527, Lit551, Lit552, lambda$Fn226), $result);
        } else {
            addToComponents(Lit527, Lit553, Lit552, lambda$Fn227);
        }
        this.Label6_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit552, Lit554, Lit555, lambda$Fn228), $result);
        } else {
            addToComponents(Lit552, Lit557, Lit555, lambda$Fn229);
        }
        this.WonSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit552, Lit558, Lit559, lambda$Fn230), $result);
        } else {
            addToComponents(Lit552, Lit561, Lit559, lambda$Fn231);
        }
        this.Space2_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit511, Lit562, Lit563, lambda$Fn232), $result);
        } else {
            addToComponents(Lit511, Lit565, Lit563, lambda$Fn233);
        }
        this.Card_View1_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit566, Lit567, lambda$Fn234), $result);
        } else {
            addToComponents(Lit85, Lit572, Lit567, lambda$Fn235);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment9 = C1171runtime.addToCurrentFormEnvironment(Lit574, this.Card_View1_copy_copy_copy_copy_copy_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit574, this.Card_View1_copy_copy_copy_copy_copy_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy_copy_copy_copy_copy_copy", "Click");
        } else {
            addToEvents(Lit567, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit567, Lit575, Lit576, lambda$Fn236), $result);
        } else {
            addToComponents(Lit567, Lit577, Lit576, lambda$Fn237);
        }
        this.Space1_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit576, Lit578, Lit579, lambda$Fn238), $result);
        } else {
            addToComponents(Lit576, Lit581, Lit579, lambda$Fn239);
        }
        this.Label1_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit576, Lit582, Lit583, lambda$Fn240), $result);
        } else {
            addToComponents(Lit576, Lit585, Lit583, lambda$Fn241);
        }
        this.Space3_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit576, Lit586, Lit587, lambda$Fn242), $result);
        } else {
            addToComponents(Lit576, Lit589, Lit587, lambda$Fn243);
        }
        this.Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit576, Lit590, Lit591, lambda$Fn244), $result);
        } else {
            addToComponents(Lit576, Lit592, Lit591, lambda$Fn245);
        }
        this.Vertical_Arrangement1_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit591, Lit593, Lit594, lambda$Fn246), $result);
        } else {
            addToComponents(Lit591, Lit595, Lit594, lambda$Fn247);
        }
        this.Label2_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit594, Lit596, Lit597, lambda$Fn248), $result);
        } else {
            addToComponents(Lit594, Lit599, Lit597, lambda$Fn249);
        }
        this.Label3_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit594, Lit600, Lit601, lambda$Fn250), $result);
        } else {
            addToComponents(Lit594, Lit603, Lit601, lambda$Fn251);
        }
        this.Vertical_Arrangement3_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit591, Lit604, Lit605, lambda$Fn252), $result);
        } else {
            addToComponents(Lit591, Lit606, Lit605, lambda$Fn253);
        }
        this.Label4_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit605, Lit607, Lit608, lambda$Fn254), $result);
        } else {
            addToComponents(Lit605, Lit610, Lit608, lambda$Fn255);
        }
        this.BtcAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit605, Lit611, Lit612, lambda$Fn256), $result);
        } else {
            addToComponents(Lit605, Lit614, Lit612, lambda$Fn257);
        }
        this.Space4 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit576, Lit615, Lit616, lambda$Fn258), $result);
        } else {
            addToComponents(Lit576, Lit618, Lit616, lambda$Fn259);
        }
        this.Space2_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit576, Lit619, Lit620, lambda$Fn260), $result);
        } else {
            addToComponents(Lit576, Lit622, Lit620, lambda$Fn261);
        }
        this.Card_View1_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit85, Lit623, Lit624, lambda$Fn262), $result);
        } else {
            addToComponents(Lit85, Lit629, Lit624, lambda$Fn263);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment10 = C1171runtime.addToCurrentFormEnvironment(Lit631, this.Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click);
        } else {
            addToFormEnvironment(Lit631, this.Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Card_View1_copy_copy_copy_copy_copy_copy_copy_copy", "Click");
        } else {
            addToEvents(Lit624, Lit113);
        }
        this.Horizontal_Arrangement1_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit624, Lit632, Lit633, lambda$Fn264), $result);
        } else {
            addToComponents(Lit624, Lit634, Lit633, lambda$Fn265);
        }
        this.Space1_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit633, Lit635, Lit636, lambda$Fn266), $result);
        } else {
            addToComponents(Lit633, Lit638, Lit636, lambda$Fn267);
        }
        this.Label1_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit633, Lit639, Lit640, lambda$Fn268), $result);
        } else {
            addToComponents(Lit633, Lit642, Lit640, lambda$Fn269);
        }
        this.Space3_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit633, Lit643, Lit644, lambda$Fn270), $result);
        } else {
            addToComponents(Lit633, Lit646, Lit644, lambda$Fn271);
        }
        this.Horizontal_Arrangement2_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit633, Lit647, Lit648, lambda$Fn272), $result);
        } else {
            addToComponents(Lit633, Lit649, Lit648, lambda$Fn273);
        }
        this.Vertical_Arrangement1_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit648, Lit650, Lit651, lambda$Fn274), $result);
        } else {
            addToComponents(Lit648, Lit652, Lit651, lambda$Fn275);
        }
        this.Label2_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit651, Lit653, Lit654, lambda$Fn276), $result);
        } else {
            addToComponents(Lit651, Lit656, Lit654, lambda$Fn277);
        }
        this.Label3_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit651, Lit657, Lit658, lambda$Fn278), $result);
        } else {
            addToComponents(Lit651, Lit660, Lit658, lambda$Fn279);
        }
        this.Vertical_Arrangement3_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit648, Lit661, Lit662, lambda$Fn280), $result);
        } else {
            addToComponents(Lit648, Lit663, Lit662, lambda$Fn281);
        }
        this.Label4_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit662, Lit664, Lit665, lambda$Fn282), $result);
        } else {
            addToComponents(Lit662, Lit667, Lit665, lambda$Fn283);
        }
        this.EthAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit662, Lit668, Lit669, lambda$Fn284), $result);
        } else {
            addToComponents(Lit662, Lit671, Lit669, lambda$Fn285);
        }
        this.Space4_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit633, Lit672, Lit673, lambda$Fn286), $result);
        } else {
            addToComponents(Lit633, Lit675, Lit673, lambda$Fn287);
        }
        this.Space2_copy_copy_copy_copy_copy_copy_copy_copy = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit633, Lit676, Lit677, lambda$Fn288), $result);
        } else {
            addToComponents(Lit633, Lit679, Lit677, lambda$Fn289);
        }
        this.dolarAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit680, Lit4, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit681, Lit4, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment11 = C1171runtime.addToCurrentFormEnvironment(Lit686, this.dolarAlis$GotElements);
        } else {
            addToFormEnvironment(Lit686, this.dolarAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "dolarAlis", "GotElements");
        } else {
            addToEvents(Lit4, Lit687);
        }
        this.dolarSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit688, Lit7, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit689, Lit7, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment12 = C1171runtime.addToCurrentFormEnvironment(Lit692, this.dolarSatis$GotElements);
        } else {
            addToFormEnvironment(Lit692, this.dolarSatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "dolarSatis", "GotElements");
        } else {
            addToEvents(Lit7, Lit687);
        }
        this.euroAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit693, Lit9, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit694, Lit9, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment13 = C1171runtime.addToCurrentFormEnvironment(Lit697, this.euroAlis$GotElements);
        } else {
            addToFormEnvironment(Lit697, this.euroAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "euroAlis", "GotElements");
        } else {
            addToEvents(Lit9, Lit687);
        }
        this.euroSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit698, Lit11, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit699, Lit11, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment14 = C1171runtime.addToCurrentFormEnvironment(Lit702, this.euroSatis$GotElements);
        } else {
            addToFormEnvironment(Lit702, this.euroSatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "euroSatis", "GotElements");
        } else {
            addToEvents(Lit11, Lit687);
        }
        this.Clock1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit703, Lit704, lambda$Fn290), $result);
        } else {
            addToComponents(Lit0, Lit707, Lit704, lambda$Fn291);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment15 = C1171runtime.addToCurrentFormEnvironment(Lit724, this.Clock1$Timer);
        } else {
            addToFormEnvironment(Lit724, this.Clock1$Timer);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "Clock1", "Timer");
        } else {
            addToEvents(Lit704, Lit725);
        }
        this.sterlinAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit726, Lit13, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit727, Lit13, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment16 = C1171runtime.addToCurrentFormEnvironment(Lit730, this.sterlinAlis$GotElements);
        } else {
            addToFormEnvironment(Lit730, this.sterlinAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "sterlinAlis", "GotElements");
        } else {
            addToEvents(Lit13, Lit687);
        }
        this.sterlinSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit731, Lit15, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit732, Lit15, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment17 = C1171runtime.addToCurrentFormEnvironment(Lit735, this.sterlinSatis$GotElements);
        } else {
            addToFormEnvironment(Lit735, this.sterlinSatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "sterlinSatis", "GotElements");
        } else {
            addToEvents(Lit15, Lit687);
        }
        this.canadaAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit736, Lit17, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit737, Lit17, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment18 = C1171runtime.addToCurrentFormEnvironment(Lit740, this.canadaAlis$GotElements);
        } else {
            addToFormEnvironment(Lit740, this.canadaAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "canadaAlis", "GotElements");
        } else {
            addToEvents(Lit17, Lit687);
        }
        this.canadaSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit741, Lit19, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit742, Lit19, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment19 = C1171runtime.addToCurrentFormEnvironment(Lit745, this.canadaSatis$GotElements);
        } else {
            addToFormEnvironment(Lit745, this.canadaSatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "canadaSatis", "GotElements");
        } else {
            addToEvents(Lit19, Lit687);
        }
        this.rubleAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit746, Lit21, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit747, Lit21, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment20 = C1171runtime.addToCurrentFormEnvironment(Lit750, this.rubleAlis$GotElements);
        } else {
            addToFormEnvironment(Lit750, this.rubleAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "rubleAlis", "GotElements");
        } else {
            addToEvents(Lit21, Lit687);
        }
        this.rubleSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit751, Lit23, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit752, Lit23, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment21 = C1171runtime.addToCurrentFormEnvironment(Lit755, this.rubleSatis$GotElements);
        } else {
            addToFormEnvironment(Lit755, this.rubleSatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "rubleSatis", "GotElements");
        } else {
            addToEvents(Lit23, Lit687);
        }
        this.jpyAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit756, Lit25, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit757, Lit25, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment22 = C1171runtime.addToCurrentFormEnvironment(Lit760, this.jpyAlis$GotElements);
        } else {
            addToFormEnvironment(Lit760, this.jpyAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "jpyAlis", "GotElements");
        } else {
            addToEvents(Lit25, Lit687);
        }
        this.jpySatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit761, Lit27, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit762, Lit27, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment23 = C1171runtime.addToCurrentFormEnvironment(Lit765, this.jpySatis$GotElements);
        } else {
            addToFormEnvironment(Lit765, this.jpySatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "jpySatis", "GotElements");
        } else {
            addToEvents(Lit27, Lit687);
        }
        this.wonAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit766, Lit29, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit767, Lit29, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment24 = C1171runtime.addToCurrentFormEnvironment(Lit770, this.wonAlis$GotElements);
        } else {
            addToFormEnvironment(Lit770, this.wonAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "wonAlis", "GotElements");
        } else {
            addToEvents(Lit29, Lit687);
        }
        this.wonSatis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit771, Lit31, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit772, Lit31, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment25 = C1171runtime.addToCurrentFormEnvironment(Lit775, this.wonSatis$GotElements);
        } else {
            addToFormEnvironment(Lit775, this.wonSatis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "wonSatis", "GotElements");
        } else {
            addToEvents(Lit31, Lit687);
        }
        this.Alt_Tabaka1 = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit776, Lit777, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit778, Lit777, Boolean.FALSE);
        }
        this.btcAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit779, Lit33, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit780, Lit33, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment26 = C1171runtime.addToCurrentFormEnvironment(Lit783, this.btcAlis$GotElements);
        } else {
            addToFormEnvironment(Lit783, this.btcAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "btcAlis", "GotElements");
        } else {
            addToEvents(Lit33, Lit687);
        }
        this.ethAlis = null;
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1171runtime.addComponentWithinRepl(Lit0, Lit784, Lit35, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit785, Lit35, Boolean.FALSE);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment27 = C1171runtime.addToCurrentFormEnvironment(Lit788, this.ethAlis$GotElements);
        } else {
            addToFormEnvironment(Lit788, this.ethAlis$GotElements);
        }
        if (C1171runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1171runtime.$Stthis$Mnform$St, "ethAlis", "GotElements");
        } else {
            addToEvents(Lit35, Lit687);
        }
        C1171runtime.initRuntime();
    }

    /* renamed from: io.kodular.cenkertrgut.dovizcevirici.Screen1$frame */
    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public frame() {
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Screen1.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen1.lambda3();
                case 20:
                    return Screen1.lambda5();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda6();
                case 23:
                    return this.$main.Screen1$Initialize();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return this.$main.Card_View1$Click();
                case 31:
                    return Screen1.lambda13();
                case 32:
                    return Screen1.lambda14();
                case 33:
                    return Screen1.lambda15();
                case 34:
                    return Screen1.lambda16();
                case 35:
                    return Screen1.lambda17();
                case 36:
                    return Screen1.lambda18();
                case 37:
                    return Screen1.lambda19();
                case 38:
                    return Screen1.lambda20();
                case 39:
                    return Screen1.lambda21();
                case 40:
                    return Screen1.lambda22();
                case 41:
                    return Screen1.lambda23();
                case 42:
                    return Screen1.lambda24();
                case 43:
                    return Screen1.lambda25();
                case 44:
                    return Screen1.lambda26();
                case 45:
                    return Screen1.lambda27();
                case 46:
                    return Screen1.lambda28();
                case 47:
                    return Screen1.lambda29();
                case 48:
                    return Screen1.lambda30();
                case 49:
                    return Screen1.lambda31();
                case 50:
                    return Screen1.lambda32();
                case 51:
                    return Screen1.lambda33();
                case 52:
                    return Screen1.lambda34();
                case 53:
                    return Screen1.lambda35();
                case 54:
                    return Screen1.lambda36();
                case 55:
                    return Screen1.lambda37();
                case 56:
                    return Screen1.lambda38();
                case 57:
                    return Screen1.lambda39();
                case 58:
                    return Screen1.lambda40();
                case 59:
                    return Screen1.lambda41();
                case 60:
                    return Screen1.lambda42();
                case 61:
                    return Screen1.lambda43();
                case 62:
                    return Screen1.lambda44();
                case 63:
                    return this.$main.Card_View1_copy$Click();
                case 64:
                    return Screen1.lambda45();
                case 65:
                    return Screen1.lambda46();
                case 66:
                    return Screen1.lambda47();
                case 67:
                    return Screen1.lambda48();
                case 68:
                    return Screen1.lambda49();
                case 69:
                    return Screen1.lambda50();
                case 70:
                    return Screen1.lambda51();
                case 71:
                    return Screen1.lambda52();
                case 72:
                    return Screen1.lambda53();
                case 73:
                    return Screen1.lambda54();
                case 74:
                    return Screen1.lambda55();
                case 75:
                    return Screen1.lambda56();
                case 76:
                    return Screen1.lambda57();
                case 77:
                    return Screen1.lambda58();
                case 78:
                    return Screen1.lambda59();
                case 79:
                    return Screen1.lambda60();
                case 80:
                    return Screen1.lambda61();
                case 81:
                    return Screen1.lambda62();
                case 82:
                    return Screen1.lambda63();
                case 83:
                    return Screen1.lambda64();
                case 84:
                    return Screen1.lambda65();
                case 85:
                    return Screen1.lambda66();
                case 86:
                    return Screen1.lambda67();
                case 87:
                    return Screen1.lambda68();
                case 88:
                    return Screen1.lambda69();
                case 89:
                    return Screen1.lambda70();
                case 90:
                    return Screen1.lambda71();
                case 91:
                    return Screen1.lambda72();
                case 92:
                    return Screen1.lambda73();
                case 93:
                    return Screen1.lambda74();
                case 94:
                    return Screen1.lambda75();
                case 95:
                    return Screen1.lambda76();
                case 96:
                    return this.$main.Card_View1_copy_copy$Click();
                case 97:
                    return Screen1.lambda77();
                case 98:
                    return Screen1.lambda78();
                case 99:
                    return Screen1.lambda79();
                case 100:
                    return Screen1.lambda80();
                case 101:
                    return Screen1.lambda81();
                case 102:
                    return Screen1.lambda82();
                case 103:
                    return Screen1.lambda83();
                case 104:
                    return Screen1.lambda84();
                case 105:
                    return Screen1.lambda85();
                case 106:
                    return Screen1.lambda86();
                case 107:
                    return Screen1.lambda87();
                case 108:
                    return Screen1.lambda88();
                case 109:
                    return Screen1.lambda89();
                case 110:
                    return Screen1.lambda90();
                case 111:
                    return Screen1.lambda91();
                case 112:
                    return Screen1.lambda92();
                case 113:
                    return Screen1.lambda93();
                case 114:
                    return Screen1.lambda94();
                case 115:
                    return Screen1.lambda95();
                case 116:
                    return Screen1.lambda96();
                case 117:
                    return Screen1.lambda97();
                case 118:
                    return Screen1.lambda98();
                case 119:
                    return Screen1.lambda99();
                case 120:
                    return Screen1.lambda100();
                case 121:
                    return Screen1.lambda101();
                case 122:
                    return Screen1.lambda102();
                case 123:
                    return Screen1.lambda103();
                case 124:
                    return Screen1.lambda104();
                case ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH:
                    return Screen1.lambda105();
                case 126:
                    return Screen1.lambda106();
                case 127:
                    return Screen1.lambda107();
                case 128:
                    return Screen1.lambda108();
                case 129:
                    return this.$main.Card_View1_copy_copy_copy$Click();
                case 130:
                    return Screen1.lambda109();
                case 131:
                    return Screen1.lambda110();
                case 132:
                    return Screen1.lambda111();
                case 133:
                    return Screen1.lambda112();
                case 134:
                    return Screen1.lambda113();
                case 135:
                    return Screen1.lambda114();
                case 136:
                    return Screen1.lambda115();
                case 137:
                    return Screen1.lambda116();
                case 138:
                    return Screen1.lambda117();
                case 139:
                    return Screen1.lambda118();
                case 140:
                    return Screen1.lambda119();
                case 141:
                    return Screen1.lambda120();
                case 142:
                    return Screen1.lambda121();
                case 143:
                    return Screen1.lambda122();
                case 144:
                    return Screen1.lambda123();
                case 145:
                    return Screen1.lambda124();
                case 146:
                    return Screen1.lambda125();
                case 147:
                    return Screen1.lambda126();
                case 148:
                    return Screen1.lambda127();
                case 149:
                    return Screen1.lambda128();
                case 150:
                    return Screen1.lambda129();
                case 151:
                    return Screen1.lambda130();
                case 152:
                    return Screen1.lambda131();
                case 153:
                    return Screen1.lambda132();
                case 154:
                    return Screen1.lambda133();
                case 155:
                    return Screen1.lambda134();
                case 156:
                    return Screen1.lambda135();
                case 157:
                    return Screen1.lambda136();
                case 158:
                    return Screen1.lambda137();
                case 159:
                    return Screen1.lambda138();
                case ComponentConstants.TEXTBOX_PREFERRED_WIDTH:
                    return Screen1.lambda139();
                case 161:
                    return Screen1.lambda140();
                case 162:
                    return this.$main.Card_View1_copy_copy_copy_copy$Click();
                case 163:
                    return Screen1.lambda141();
                case 164:
                    return Screen1.lambda142();
                case 165:
                    return Screen1.lambda143();
                case 166:
                    return Screen1.lambda144();
                case 167:
                    return Screen1.lambda145();
                case 168:
                    return Screen1.lambda146();
                case 169:
                    return Screen1.lambda147();
                case 170:
                    return Screen1.lambda148();
                case 171:
                    return Screen1.lambda149();
                case 172:
                    return Screen1.lambda150();
                case 173:
                    return Screen1.lambda151();
                case 174:
                    return Screen1.lambda152();
                case 175:
                    return Screen1.lambda153();
                case 176:
                    return Screen1.lambda154();
                case 177:
                    return Screen1.lambda155();
                case 178:
                    return Screen1.lambda156();
                case 179:
                    return Screen1.lambda157();
                case 180:
                    return Screen1.lambda158();
                case 181:
                    return Screen1.lambda159();
                case 182:
                    return Screen1.lambda160();
                case 183:
                    return Screen1.lambda161();
                case 184:
                    return Screen1.lambda162();
                case 185:
                    return Screen1.lambda163();
                case 186:
                    return Screen1.lambda164();
                case 187:
                    return Screen1.lambda165();
                case 188:
                    return Screen1.lambda166();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_DIALOG_FLAG:
                    return Screen1.lambda167();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SEEK:
                    return Screen1.lambda168();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_PLAY:
                    return Screen1.lambda169();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_PAUSE:
                    return Screen1.lambda170();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_STOP:
                    return Screen1.lambda171();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SOURCE:
                    return Screen1.lambda172();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_FULLSCREEN:
                    return this.$main.Card_View1_copy_copy_copy_copy_copy$Click();
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_DURATION:
                    return Screen1.lambda173();
                case 197:
                    return Screen1.lambda174();
                case 198:
                    return Screen1.lambda175();
                case 199:
                    return Screen1.lambda176();
                case 200:
                    return Screen1.lambda177();
                case ErrorMessages.ERROR_CAMERA_NO_IMAGE_RETURNED:
                    return Screen1.lambda178();
                case ErrorMessages.ERROR_NO_CAMERA_PERMISSION:
                    return Screen1.lambda179();
                case 203:
                    return Screen1.lambda180();
                case 204:
                    return Screen1.lambda181();
                case 205:
                    return Screen1.lambda182();
                case 206:
                    return Screen1.lambda183();
                case 207:
                    return Screen1.lambda184();
                case 208:
                    return Screen1.lambda185();
                case 209:
                    return Screen1.lambda186();
                case 210:
                    return Screen1.lambda187();
                case 211:
                    return Screen1.lambda188();
                case 212:
                    return Screen1.lambda189();
                case 213:
                    return Screen1.lambda190();
                case 214:
                    return Screen1.lambda191();
                case 215:
                    return Screen1.lambda192();
                case 216:
                    return Screen1.lambda193();
                case 217:
                    return Screen1.lambda194();
                case 218:
                    return Screen1.lambda195();
                case 219:
                    return Screen1.lambda196();
                case 220:
                    return Screen1.lambda197();
                case 221:
                    return Screen1.lambda198();
                case 222:
                    return Screen1.lambda199();
                case 223:
                    return Screen1.lambda200();
                case 224:
                    return Screen1.lambda201();
                case 225:
                    return Screen1.lambda202();
                case 226:
                    return Screen1.lambda203();
                case 227:
                    return Screen1.lambda204();
                case 228:
                    return this.$main.Card_View1_copy_copy_copy_copy_copy_copy$Click();
                case 229:
                    return Screen1.lambda205();
                case 230:
                    return Screen1.lambda206();
                case 231:
                    return Screen1.lambda207();
                case 232:
                    return Screen1.lambda208();
                case 233:
                    return Screen1.lambda209();
                case 234:
                    return Screen1.lambda210();
                case 235:
                    return Screen1.lambda211();
                case 236:
                    return Screen1.lambda212();
                case 237:
                    return Screen1.lambda213();
                case 238:
                    return Screen1.lambda214();
                case 239:
                    return Screen1.lambda215();
                case 240:
                    return Screen1.lambda216();
                case 241:
                    return Screen1.lambda217();
                case LispEscapeFormat.ESCAPE_ALL:
                    return Screen1.lambda218();
                case 243:
                    return Screen1.lambda219();
                case 244:
                    return Screen1.lambda220();
                case 245:
                    return Screen1.lambda221();
                case 246:
                    return Screen1.lambda222();
                case 247:
                    return Screen1.lambda223();
                case ComponentConstants.LISTVIEW_PREFERRED_WIDTH:
                    return Screen1.lambda224();
                case 249:
                    return Screen1.lambda225();
                case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION:
                    return Screen1.lambda226();
                case Telnet.WILL:
                    return Screen1.lambda227();
                case Telnet.WONT:
                    return Screen1.lambda228();
                case Telnet.f258DO:
                    return Screen1.lambda229();
                case Telnet.DONT:
                    return Screen1.lambda230();
                case 255:
                    return Screen1.lambda231();
                case 256:
                    return Screen1.lambda232();
                case InputDeviceCompat.SOURCE_KEYBOARD:
                    return Screen1.lambda233();
                case 258:
                    return Screen1.lambda234();
                case 259:
                    return Screen1.lambda235();
                case 260:
                    return Screen1.lambda236();
                case 261:
                    return this.$main.Card_View1_copy_copy_copy_copy_copy_copy_copy$Click();
                case 262:
                    return Screen1.lambda237();
                case 263:
                    return Screen1.lambda238();
                case 264:
                    return Screen1.lambda239();
                case 265:
                    return Screen1.lambda240();
                case 266:
                    return Screen1.lambda241();
                case 267:
                    return Screen1.lambda242();
                case 268:
                    return Screen1.lambda243();
                case 269:
                    return Screen1.lambda244();
                case 270:
                    return Screen1.lambda245();
                case 271:
                    return Screen1.lambda246();
                case 272:
                    return Screen1.lambda247();
                case 273:
                    return Screen1.lambda248();
                case 274:
                    return Screen1.lambda249();
                case 275:
                    return Screen1.lambda250();
                case 276:
                    return Screen1.lambda251();
                case 277:
                    return Screen1.lambda252();
                case 278:
                    return Screen1.lambda253();
                case 279:
                    return Screen1.lambda254();
                case 280:
                    return Screen1.lambda255();
                case 281:
                    return Screen1.lambda256();
                case 282:
                    return Screen1.lambda257();
                case 283:
                    return Screen1.lambda258();
                case 284:
                    return Screen1.lambda259();
                case 285:
                    return Screen1.lambda260();
                case 286:
                    return Screen1.lambda261();
                case 287:
                    return Screen1.lambda262();
                case 288:
                    return Screen1.lambda263();
                case 289:
                    return Screen1.lambda264();
                case 290:
                    return this.$main.Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click();
                case 291:
                    return Screen1.lambda265();
                case 292:
                    return Screen1.lambda266();
                case 293:
                    return Screen1.lambda267();
                case 294:
                    return Screen1.lambda268();
                case 295:
                    return Screen1.lambda269();
                case 296:
                    return Screen1.lambda270();
                case 297:
                    return Screen1.lambda271();
                case 298:
                    return Screen1.lambda272();
                case 299:
                    return Screen1.lambda273();
                case 300:
                    return Screen1.lambda274();
                case ErrorMessages.ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION:
                    return Screen1.lambda275();
                case ErrorMessages.ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET:
                    return Screen1.lambda276();
                case ErrorMessages.ERROR_TWITTER_EXCEPTION:
                    return Screen1.lambda277();
                case ErrorMessages.ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN:
                    return Screen1.lambda278();
                case ErrorMessages.ERROR_TWITTER_AUTHORIZATION_FAILED:
                    return Screen1.lambda279();
                case ErrorMessages.ERROR_TWITTER_SET_STATUS_FAILED:
                    return Screen1.lambda280();
                case ErrorMessages.ERROR_TWITTER_REQUEST_MENTIONS_FAILED:
                    return Screen1.lambda281();
                case ErrorMessages.ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED:
                    return Screen1.lambda282();
                case ErrorMessages.ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED:
                    return Screen1.lambda283();
                case ErrorMessages.ERROR_TWITTER_DIRECT_MESSAGE_FAILED:
                    return Screen1.lambda284();
                case ErrorMessages.ERROR_TWITTER_FOLLOW_FAILED:
                    return Screen1.lambda285();
                case ErrorMessages.ERROR_TWITTER_STOP_FOLLOWING_FAILED:
                    return Screen1.lambda286();
                case ErrorMessages.ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED:
                    return Screen1.lambda287();
                case ErrorMessages.ERROR_TWITTER_SEARCH_FAILED:
                    return Screen1.lambda288();
                case ErrorMessages.ERROR_TWITTER_INVALID_IMAGE_PATH:
                    return Screen1.lambda289();
                case 316:
                    return Screen1.lambda290();
                case 321:
                    return Screen1.lambda291();
                case 322:
                    return Screen1.lambda292();
                case 323:
                    return this.$main.Clock1$Timer();
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
                case 29:
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
                case 37:
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
                case 52:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 53:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 54:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 55:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 56:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 57:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 58:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 59:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 60:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 61:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 62:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 63:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 64:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 65:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 66:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 67:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 68:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 69:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 70:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 71:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 72:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 73:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 74:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 75:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 76:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 77:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 78:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 79:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 80:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 81:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 82:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 83:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 84:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 85:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 86:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 87:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 88:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 89:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 90:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 91:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 92:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 93:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 94:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 95:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 96:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 97:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 98:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 99:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 100:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 101:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 102:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 103:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 104:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 105:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 106:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 107:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 108:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 109:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 110:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 111:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 112:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 113:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 114:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 115:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 116:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 117:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 118:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 119:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 120:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 121:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 122:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 123:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 124:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 126:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 127:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 128:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 129:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 130:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 131:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 132:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 133:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 134:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 135:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 136:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 137:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 138:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 139:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 140:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 141:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 142:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 143:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 144:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 145:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 146:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 147:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 148:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 149:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 150:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 151:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 152:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 153:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 154:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 155:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 156:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 157:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 158:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 159:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ComponentConstants.TEXTBOX_PREFERRED_WIDTH:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 161:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 162:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 163:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 164:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 165:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 166:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 167:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 168:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 169:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 170:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 171:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 172:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 173:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 174:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 175:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 176:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 177:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 178:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 179:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 180:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 181:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 182:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 183:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 184:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 185:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 186:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 187:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 188:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_DIALOG_FLAG:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SEEK:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_PLAY:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_PAUSE:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_STOP:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SOURCE:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_FULLSCREEN:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_DURATION:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 197:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 198:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 199:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 200:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_CAMERA_NO_IMAGE_RETURNED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_NO_CAMERA_PERMISSION:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 203:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 204:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 205:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 206:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 207:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 208:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 209:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 210:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 211:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 212:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 213:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 214:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 215:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 216:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 217:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 218:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 219:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 220:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 221:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 222:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 223:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 224:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 225:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 226:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 227:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 228:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 229:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 230:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 231:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 232:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 233:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 234:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 235:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 236:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 237:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 238:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 239:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 240:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 241:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case LispEscapeFormat.ESCAPE_ALL:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 243:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 244:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 245:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 246:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 247:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ComponentConstants.LISTVIEW_PREFERRED_WIDTH:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 249:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case Telnet.WILL:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case Telnet.WONT:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case Telnet.f258DO:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case Telnet.DONT:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 255:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 256:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case InputDeviceCompat.SOURCE_KEYBOARD:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 258:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 259:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 260:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 261:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 262:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 263:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 264:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 265:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 266:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 267:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 268:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 269:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 270:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 271:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 272:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 273:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 274:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 275:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 276:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 277:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 278:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 279:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 280:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 281:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 282:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 283:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 284:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 285:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 286:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 287:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 288:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 289:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 290:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 291:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 292:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 293:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 294:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 295:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 296:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 297:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 298:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 299:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 300:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_EXCEPTION:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_AUTHORIZATION_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_SET_STATUS_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_REQUEST_MENTIONS_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_DIRECT_MESSAGE_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_FOLLOW_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_STOP_FOLLOWING_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_SEARCH_FAILED:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case ErrorMessages.ERROR_TWITTER_INVALID_IMAGE_PATH:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 316:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 321:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 322:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 323:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
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
                    if (!(obj7 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 317:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 318:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 319:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case ScreenDensityUtil.DEFAULT_NORMAL_SHORT_DIMENSION:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 324:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 325:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 326:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 327:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 328:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 329:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 330:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 331:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 332:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 333:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 334:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 335:
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
                    if (!(obj9 instanceof Screen1)) {
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
                    if (!(obj17 instanceof Screen1)) {
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
                case 317:
                    return this.$main.dolarAlis$GotElements(obj2);
                case 318:
                    return this.$main.dolarSatis$GotElements(obj2);
                case 319:
                    return this.$main.euroAlis$GotElements(obj2);
                case ScreenDensityUtil.DEFAULT_NORMAL_SHORT_DIMENSION:
                    return this.$main.euroSatis$GotElements(obj2);
                case 324:
                    return this.$main.sterlinAlis$GotElements(obj2);
                case 325:
                    return this.$main.sterlinSatis$GotElements(obj2);
                case 326:
                    return this.$main.canadaAlis$GotElements(obj2);
                case 327:
                    return this.$main.canadaSatis$GotElements(obj2);
                case 328:
                    return this.$main.rubleAlis$GotElements(obj2);
                case 329:
                    return this.$main.rubleSatis$GotElements(obj2);
                case 330:
                    return this.$main.jpyAlis$GotElements(obj2);
                case 331:
                    return this.$main.jpySatis$GotElements(obj2);
                case 332:
                    return this.$main.wonAlis$GotElements(obj2);
                case 333:
                    return this.$main.wonSatis$GotElements(obj2);
                case 334:
                    return this.$main.btcAlis$GotElements(obj2);
                case 335:
                    return this.$main.ethAlis$GotElements(obj2);
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
    }

    static Object lambda3() {
        Object callComponentMethod = C1171runtime.callComponentMethod(Lit4, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/amerikan-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit6);
        Object callComponentMethod2 = C1171runtime.callComponentMethod(Lit7, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/amerikan-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit8);
        Object callComponentMethod3 = C1171runtime.callComponentMethod(Lit9, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/euro", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit10);
        Object callComponentMethod4 = C1171runtime.callComponentMethod(Lit11, Lit5, LList.list2("body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)", "https://kur.doviz.com/serbest-piyasa/euro"), Lit12);
        Object callComponentMethod5 = C1171runtime.callComponentMethod(Lit13, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/sterlin", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit14);
        Object callComponentMethod6 = C1171runtime.callComponentMethod(Lit15, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/sterlin", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit16);
        Object callComponentMethod7 = C1171runtime.callComponentMethod(Lit17, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/kanada-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit18);
        Object callComponentMethod8 = C1171runtime.callComponentMethod(Lit19, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/kanada-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit20);
        Object callComponentMethod9 = C1171runtime.callComponentMethod(Lit21, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/rus-rublesi", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit22);
        Object callComponentMethod10 = C1171runtime.callComponentMethod(Lit23, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/rus-rublesi", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit24);
        Object callComponentMethod11 = C1171runtime.callComponentMethod(Lit25, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/japon-yeni", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit26);
        Object callComponentMethod12 = C1171runtime.callComponentMethod(Lit27, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/japon-yeni", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit28);
        Object callComponentMethod13 = C1171runtime.callComponentMethod(Lit29, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/guney-kore-wonu", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit30);
        Object callComponentMethod14 = C1171runtime.callComponentMethod(Lit31, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/guney-kore-wonu", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit32);
        Object callComponentMethod15 = C1171runtime.callComponentMethod(Lit33, Lit5, LList.list2("https://www.doviz.com/kripto-paralar/bitcoin", "body > div.wrapper > div.kur-page > div.article-content > div:nth-child(1) > div > div.flex.justify-between.mt-8 > div:nth-child(1) > div.text-xl.font-semibold.text-white"), Lit34);
        return C1171runtime.callComponentMethod(Lit35, Lit5, LList.list2("https://www.doviz.com/kripto-paralar/ethereum", "body > div.wrapper > div.kur-page > div.article-content > div:nth-child(1) > div > div.flex.justify-between.mt-8 > div:nth-child(1) > div.text-xl.font-semibold.text-white"), Lit36);
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5() {
        Object callComponentMethod = C1171runtime.callComponentMethod(Lit4, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/amerikan-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit37);
        Object callComponentMethod2 = C1171runtime.callComponentMethod(Lit7, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/amerikan-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit38);
        Object callComponentMethod3 = C1171runtime.callComponentMethod(Lit9, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/euro", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit39);
        Object callComponentMethod4 = C1171runtime.callComponentMethod(Lit11, Lit5, LList.list2("body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)", "https://kur.doviz.com/serbest-piyasa/euro"), Lit40);
        Object callComponentMethod5 = C1171runtime.callComponentMethod(Lit13, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/sterlin", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit41);
        Object callComponentMethod6 = C1171runtime.callComponentMethod(Lit15, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/sterlin", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit42);
        Object callComponentMethod7 = C1171runtime.callComponentMethod(Lit17, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/kanada-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit43);
        Object callComponentMethod8 = C1171runtime.callComponentMethod(Lit19, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/kanada-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit44);
        Object callComponentMethod9 = C1171runtime.callComponentMethod(Lit21, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/rus-rublesi", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit45);
        Object callComponentMethod10 = C1171runtime.callComponentMethod(Lit23, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/rus-rublesi", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit46);
        Object callComponentMethod11 = C1171runtime.callComponentMethod(Lit25, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/japon-yeni", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit47);
        Object callComponentMethod12 = C1171runtime.callComponentMethod(Lit27, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/japon-yeni", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit48);
        Object callComponentMethod13 = C1171runtime.callComponentMethod(Lit29, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/guney-kore-wonu", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit49);
        Object callComponentMethod14 = C1171runtime.callComponentMethod(Lit31, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/guney-kore-wonu", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit50);
        Object callComponentMethod15 = C1171runtime.callComponentMethod(Lit33, Lit5, LList.list2("https://www.doviz.com/kripto-paralar/bitcoin", "body > div.wrapper > div.kur-page > div.article-content > div:nth-child(1) > div > div.flex.justify-between.mt-8 > div:nth-child(1) > div.text-xl.font-semibold.text-white"), Lit51);
        return C1171runtime.callComponentMethod(Lit35, Lit5, LList.list2("https://www.doviz.com/kripto-paralar/ethereum", "body > div.wrapper > div.kur-page > div.article-content > div:nth-child(1) > div > div.flex.justify-between.mt-8 > div:nth-child(1) > div.text-xl.font-semibold.text-white"), Lit52);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit53, "", Lit54);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit55, Lit56, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit62, "6745161059008512", Lit54);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit63, "dovizcevirici", Lit54);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit64, Lit65, Lit57);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit66, Lit67, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit68, Lit69, Lit57);
        Object andCoerceProperty$Ex10 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit70, Lit71, Lit57);
        Object andCoerceProperty$Ex11 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit72, AlgorithmIdentifiers.NONE, Lit54);
        Object andCoerceProperty$Ex12 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit73, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex13 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit75, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex14 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit76, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex15 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit77, "None", Lit54);
        Object andCoerceProperty$Ex16 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit78, "Döviz Çevirici", Lit54);
        Object andCoerceProperty$Ex17 = C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit79, Lit80, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit0, Lit81, "Ana Sayfa", Lit54);
    }

    public Object Screen1$Initialize() {
        C1171runtime.setThisForm();
        return Scheme.applyToArgs.apply1(C1171runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C1171runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit85, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit85, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit85, Lit88, Lit87, Lit57);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit85, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit85, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit85, Lit88, Lit87, Lit57);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit92, "indir_(3).png", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit93, Lit94, Lit57);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit92, "indir_(3).png", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit91, Lit93, Lit94, Lit57);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit64, Lit98, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit86, Lit106, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit107, Lit108, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit88, Lit109, Lit57);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit64, Lit98, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit86, Lit106, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit107, Lit108, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit97, Lit88, Lit109, Lit57);
    }

    public Object Card_View1$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit111, "open another screen");
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit88, Lit87, Lit57);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit115, Lit88, Lit87, Lit57);
    }

    static Object lambda15() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit118, Lit88, Lit119, Lit57);
    }

    static Object lambda16() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit118, Lit88, Lit119, Lit57);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit128, "&#xf155;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit129, Lit130, Lit57);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit128, "&#xf155;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit122, Lit129, Lit130, Lit57);
    }

    static Object lambda19() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit133, Lit88, Lit134, Lit57);
    }

    static Object lambda20() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit133, Lit88, Lit134, Lit57);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit137, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit137, Lit88, Lit87, Lit57);
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit137, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit137, Lit88, Lit87, Lit57);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit140, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit140, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit140, Lit88, Lit87, Lit57);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit140, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit140, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit140, Lit88, Lit87, Lit57);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit128, "USD", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit129, Lit146, Lit57);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit128, "USD", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit143, Lit129, Lit146, Lit57);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit149, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit149, Lit128, "Dolar", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit149, Lit129, Lit151, Lit57);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit149, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit149, Lit128, "Dolar", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit149, Lit129, Lit151, Lit57);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit88, Lit87, Lit57);
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit154, Lit88, Lit87, Lit57);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit157, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit157, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit157, Lit129, Lit159, Lit57);
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit157, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit157, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit157, Lit129, Lit159, Lit57);
    }

    static Object lambda33() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit162, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit162, Lit129, Lit163, Lit57);
    }

    static Object lambda34() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit162, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit162, Lit129, Lit163, Lit57);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit88, Lit87, Lit57);
    }

    static Object lambda36() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit166, Lit88, Lit87, Lit57);
    }

    static Object lambda37() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit169, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit169, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit169, Lit129, Lit170, Lit57);
    }

    static Object lambda38() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit169, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit169, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit169, Lit129, Lit170, Lit57);
    }

    static Object lambda39() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit173, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit173, Lit129, Lit174, Lit57);
    }

    static Object lambda40() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit173, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit173, Lit129, Lit174, Lit57);
    }

    static Object lambda41() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit177, Lit88, Lit178, Lit57);
    }

    static Object lambda42() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit177, Lit88, Lit178, Lit57);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit64, Lit182, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit86, Lit183, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit107, Lit184, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit88, Lit185, Lit57);
    }

    static Object lambda44() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit64, Lit182, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit86, Lit183, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit107, Lit184, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit181, Lit88, Lit185, Lit57);
    }

    public Object Card_View1_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit187, "open another screen");
    }

    static Object lambda45() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit88, Lit87, Lit57);
    }

    static Object lambda46() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit190, Lit88, Lit87, Lit57);
    }

    static Object lambda47() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit193, Lit88, Lit194, Lit57);
    }

    static Object lambda48() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit193, Lit88, Lit194, Lit57);
    }

    static Object lambda49() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit128, "&#xf153;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit129, Lit198, Lit57);
    }

    static Object lambda50() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit128, "&#xf153;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit197, Lit129, Lit198, Lit57);
    }

    static Object lambda51() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit201, Lit88, Lit202, Lit57);
    }

    static Object lambda52() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit201, Lit88, Lit202, Lit57);
    }

    static Object lambda53() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit205, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit205, Lit88, Lit87, Lit57);
    }

    static Object lambda54() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit205, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit205, Lit88, Lit87, Lit57);
    }

    static Object lambda55() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit208, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit208, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit208, Lit88, Lit87, Lit57);
    }

    static Object lambda56() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit208, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit208, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit208, Lit88, Lit87, Lit57);
    }

    static Object lambda57() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit128, "EUR", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit129, Lit212, Lit57);
    }

    static Object lambda58() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit128, "EUR", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit211, Lit129, Lit212, Lit57);
    }

    static Object lambda59() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit215, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit215, Lit128, "Euro", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit215, Lit129, Lit216, Lit57);
    }

    static Object lambda60() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit215, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit215, Lit128, "Euro", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit215, Lit129, Lit216, Lit57);
    }

    static Object lambda61() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit88, Lit87, Lit57);
    }

    static Object lambda62() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit219, Lit88, Lit87, Lit57);
    }

    static Object lambda63() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit222, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit222, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit222, Lit129, Lit223, Lit57);
    }

    static Object lambda64() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit222, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit222, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit222, Lit129, Lit223, Lit57);
    }

    static Object lambda65() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit226, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit226, Lit129, Lit227, Lit57);
    }

    static Object lambda66() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit226, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit226, Lit129, Lit227, Lit57);
    }

    static Object lambda67() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit88, Lit87, Lit57);
    }

    static Object lambda68() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit230, Lit88, Lit87, Lit57);
    }

    static Object lambda69() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit233, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit233, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit233, Lit129, Lit234, Lit57);
    }

    static Object lambda70() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit233, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit233, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit233, Lit129, Lit234, Lit57);
    }

    static Object lambda71() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit237, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit237, Lit129, Lit238, Lit57);
    }

    static Object lambda72() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit237, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit237, Lit129, Lit238, Lit57);
    }

    static Object lambda73() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit241, Lit88, Lit242, Lit57);
    }

    static Object lambda74() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit241, Lit88, Lit242, Lit57);
    }

    static Object lambda75() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit64, Lit246, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit86, Lit247, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit107, Lit248, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit88, Lit249, Lit57);
    }

    static Object lambda76() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit64, Lit246, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit86, Lit247, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit107, Lit248, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit245, Lit88, Lit249, Lit57);
    }

    public Object Card_View1_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit251, "open another screen");
    }

    static Object lambda77() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit88, Lit87, Lit57);
    }

    static Object lambda78() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit254, Lit88, Lit87, Lit57);
    }

    static Object lambda79() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit257, Lit88, Lit258, Lit57);
    }

    static Object lambda80() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit257, Lit88, Lit258, Lit57);
    }

    static Object lambda81() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit128, "&#xf154;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit129, Lit262, Lit57);
    }

    static Object lambda82() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit128, "&#xf154;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit261, Lit129, Lit262, Lit57);
    }

    static Object lambda83() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit265, Lit88, Lit266, Lit57);
    }

    static Object lambda84() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit265, Lit88, Lit266, Lit57);
    }

    static Object lambda85() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit269, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit269, Lit88, Lit87, Lit57);
    }

    static Object lambda86() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit269, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit269, Lit88, Lit87, Lit57);
    }

    static Object lambda87() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit272, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit272, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit272, Lit88, Lit87, Lit57);
    }

    static Object lambda88() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit272, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit272, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit272, Lit88, Lit87, Lit57);
    }

    static Object lambda89() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit128, "GBP", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit129, Lit276, Lit57);
    }

    static Object lambda90() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit128, "GBP", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit275, Lit129, Lit276, Lit57);
    }

    static Object lambda91() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit279, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit279, Lit128, "Sterlin", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit279, Lit129, Lit280, Lit57);
    }

    static Object lambda92() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit279, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit279, Lit128, "Sterlin", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit279, Lit129, Lit280, Lit57);
    }

    static Object lambda93() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit88, Lit87, Lit57);
    }

    static Object lambda94() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit283, Lit88, Lit87, Lit57);
    }

    static Object lambda95() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit286, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit286, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit286, Lit129, Lit287, Lit57);
    }

    static Object lambda96() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit286, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit286, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit286, Lit129, Lit287, Lit57);
    }

    static Object lambda97() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit290, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit290, Lit129, Lit291, Lit57);
    }

    static Object lambda98() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit290, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit290, Lit129, Lit291, Lit57);
    }

    static Object lambda100() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit88, Lit87, Lit57);
    }

    static Object lambda99() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit294, Lit88, Lit87, Lit57);
    }

    static Object lambda101() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit297, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit297, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit297, Lit129, Lit298, Lit57);
    }

    static Object lambda102() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit297, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit297, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit297, Lit129, Lit298, Lit57);
    }

    static Object lambda103() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit301, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit301, Lit129, Lit302, Lit57);
    }

    static Object lambda104() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit301, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit301, Lit129, Lit302, Lit57);
    }

    static Object lambda105() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit305, Lit88, Lit306, Lit57);
    }

    static Object lambda106() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit305, Lit88, Lit306, Lit57);
    }

    static Object lambda107() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit64, Lit310, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit86, Lit311, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit107, Lit312, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit88, Lit313, Lit57);
    }

    static Object lambda108() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit64, Lit310, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit86, Lit311, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit107, Lit312, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit309, Lit88, Lit313, Lit57);
    }

    public Object Card_View1_copy_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit315, "open another screen");
    }

    static Object lambda109() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit88, Lit87, Lit57);
    }

    static Object lambda110() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit318, Lit88, Lit87, Lit57);
    }

    static Object lambda111() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit321, Lit88, Lit322, Lit57);
    }

    static Object lambda112() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit321, Lit88, Lit322, Lit57);
    }

    static Object lambda113() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit125, Lit326, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit128, "&#xf785;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit129, Lit327, Lit57);
    }

    static Object lambda114() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit125, Lit326, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit128, "&#xf785;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit325, Lit129, Lit327, Lit57);
    }

    static Object lambda115() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit330, Lit88, Lit331, Lit57);
    }

    static Object lambda116() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit330, Lit88, Lit331, Lit57);
    }

    static Object lambda117() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit334, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit334, Lit88, Lit87, Lit57);
    }

    static Object lambda118() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit334, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit334, Lit88, Lit87, Lit57);
    }

    static Object lambda119() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit337, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit337, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit337, Lit88, Lit87, Lit57);
    }

    static Object lambda120() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit337, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit337, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit337, Lit88, Lit87, Lit57);
    }

    static Object lambda121() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit128, "CAD", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit129, Lit341, Lit57);
    }

    static Object lambda122() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit128, "CAD", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit340, Lit129, Lit341, Lit57);
    }

    static Object lambda123() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit344, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit344, Lit128, "Kanada Doları", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit344, Lit129, Lit345, Lit57);
    }

    static Object lambda124() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit344, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit344, Lit128, "Kanada Doları", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit344, Lit129, Lit345, Lit57);
    }

    static Object lambda125() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit88, Lit87, Lit57);
    }

    static Object lambda126() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit348, Lit88, Lit87, Lit57);
    }

    static Object lambda127() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit351, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit351, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit351, Lit129, Lit352, Lit57);
    }

    static Object lambda128() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit351, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit351, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit351, Lit129, Lit352, Lit57);
    }

    static Object lambda129() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit355, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit355, Lit129, Lit356, Lit57);
    }

    static Object lambda130() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit355, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit355, Lit129, Lit356, Lit57);
    }

    static Object lambda131() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit88, Lit87, Lit57);
    }

    static Object lambda132() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit359, Lit88, Lit87, Lit57);
    }

    static Object lambda133() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit362, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit362, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit362, Lit129, Lit363, Lit57);
    }

    static Object lambda134() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit362, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit362, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit362, Lit129, Lit363, Lit57);
    }

    static Object lambda135() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit366, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit366, Lit129, Lit367, Lit57);
    }

    static Object lambda136() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit366, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit366, Lit129, Lit367, Lit57);
    }

    static Object lambda137() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit370, Lit88, Lit371, Lit57);
    }

    static Object lambda138() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit370, Lit88, Lit371, Lit57);
    }

    static Object lambda139() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit64, Lit375, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit86, Lit376, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit107, Lit377, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit88, Lit378, Lit57);
    }

    static Object lambda140() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit64, Lit375, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit86, Lit376, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit107, Lit377, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit374, Lit88, Lit378, Lit57);
    }

    public Object Card_View1_copy_copy_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit380, "open another screen");
    }

    static Object lambda141() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit88, Lit87, Lit57);
    }

    static Object lambda142() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit383, Lit88, Lit87, Lit57);
    }

    static Object lambda143() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit386, Lit88, Lit387, Lit57);
    }

    static Object lambda144() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit386, Lit88, Lit387, Lit57);
    }

    static Object lambda145() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit128, "&#xf158;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit129, Lit391, Lit57);
    }

    static Object lambda146() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit128, "&#xf158;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit390, Lit129, Lit391, Lit57);
    }

    static Object lambda147() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit394, Lit88, Lit395, Lit57);
    }

    static Object lambda148() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit394, Lit88, Lit395, Lit57);
    }

    static Object lambda149() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit398, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit398, Lit88, Lit87, Lit57);
    }

    static Object lambda150() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit398, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit398, Lit88, Lit87, Lit57);
    }

    static Object lambda151() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit401, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit401, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit401, Lit88, Lit87, Lit57);
    }

    static Object lambda152() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit401, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit401, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit401, Lit88, Lit87, Lit57);
    }

    static Object lambda153() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit128, "RUB", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit129, Lit405, Lit57);
    }

    static Object lambda154() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit128, "RUB", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit404, Lit129, Lit405, Lit57);
    }

    static Object lambda155() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit408, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit408, Lit128, "Rus Rublesi", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit408, Lit129, Lit409, Lit57);
    }

    static Object lambda156() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit408, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit408, Lit128, "Rus Rublesi", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit408, Lit129, Lit409, Lit57);
    }

    static Object lambda157() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit88, Lit87, Lit57);
    }

    static Object lambda158() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit412, Lit88, Lit87, Lit57);
    }

    static Object lambda159() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit415, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit415, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit415, Lit129, Lit416, Lit57);
    }

    static Object lambda160() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit415, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit415, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit415, Lit129, Lit416, Lit57);
    }

    static Object lambda161() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit419, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit419, Lit129, Lit420, Lit57);
    }

    static Object lambda162() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit419, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit419, Lit129, Lit420, Lit57);
    }

    static Object lambda163() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit88, Lit87, Lit57);
    }

    static Object lambda164() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit423, Lit88, Lit87, Lit57);
    }

    static Object lambda165() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit426, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit426, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit426, Lit129, Lit427, Lit57);
    }

    static Object lambda166() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit426, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit426, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit426, Lit129, Lit427, Lit57);
    }

    static Object lambda167() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit430, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit430, Lit129, Lit431, Lit57);
    }

    static Object lambda168() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit430, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit430, Lit129, Lit431, Lit57);
    }

    static Object lambda169() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit434, Lit88, Lit435, Lit57);
    }

    static Object lambda170() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit434, Lit88, Lit435, Lit57);
    }

    static Object lambda171() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit64, Lit439, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit86, Lit440, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit107, Lit441, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit88, Lit442, Lit57);
    }

    static Object lambda172() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit64, Lit439, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit86, Lit440, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit107, Lit441, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit438, Lit88, Lit442, Lit57);
    }

    public Object Card_View1_copy_copy_copy_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit444, "open another screen");
    }

    static Object lambda173() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit88, Lit87, Lit57);
    }

    static Object lambda174() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit447, Lit88, Lit87, Lit57);
    }

    static Object lambda175() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit450, Lit88, Lit451, Lit57);
    }

    static Object lambda176() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit450, Lit88, Lit451, Lit57);
    }

    static Object lambda177() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit128, "&#xf157;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit129, Lit455, Lit57);
    }

    static Object lambda178() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit128, "&#xf157;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit454, Lit129, Lit455, Lit57);
    }

    static Object lambda179() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit458, Lit88, Lit459, Lit57);
    }

    static Object lambda180() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit458, Lit88, Lit459, Lit57);
    }

    static Object lambda181() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit462, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit462, Lit88, Lit87, Lit57);
    }

    static Object lambda182() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit462, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit462, Lit88, Lit87, Lit57);
    }

    static Object lambda183() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit465, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit465, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit465, Lit88, Lit87, Lit57);
    }

    static Object lambda184() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit465, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit465, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit465, Lit88, Lit87, Lit57);
    }

    static Object lambda185() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit128, "JPY", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit129, Lit469, Lit57);
    }

    static Object lambda186() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit128, "JPY", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit468, Lit129, Lit469, Lit57);
    }

    static Object lambda187() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit472, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit472, Lit128, "Japon Yeni", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit472, Lit129, Lit473, Lit57);
    }

    static Object lambda188() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit472, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit472, Lit128, "Japon Yeni", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit472, Lit129, Lit473, Lit57);
    }

    static Object lambda189() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit88, Lit87, Lit57);
    }

    static Object lambda190() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit476, Lit88, Lit87, Lit57);
    }

    static Object lambda191() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit479, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit479, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit479, Lit129, Lit480, Lit57);
    }

    static Object lambda192() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit479, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit479, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit479, Lit129, Lit480, Lit57);
    }

    static Object lambda193() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit483, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit483, Lit129, Lit484, Lit57);
    }

    static Object lambda194() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit483, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit483, Lit129, Lit484, Lit57);
    }

    static Object lambda195() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit88, Lit87, Lit57);
    }

    static Object lambda196() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit487, Lit88, Lit87, Lit57);
    }

    static Object lambda197() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit490, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit490, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit490, Lit129, Lit491, Lit57);
    }

    static Object lambda198() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit490, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit490, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit490, Lit129, Lit491, Lit57);
    }

    static Object lambda199() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit494, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit494, Lit129, Lit495, Lit57);
    }

    static Object lambda200() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit494, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit494, Lit129, Lit495, Lit57);
    }

    static Object lambda201() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit498, Lit88, Lit499, Lit57);
    }

    static Object lambda202() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit498, Lit88, Lit499, Lit57);
    }

    static Object lambda203() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit64, Lit503, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit86, Lit504, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit107, Lit505, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit88, Lit506, Lit57);
    }

    static Object lambda204() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit64, Lit503, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit86, Lit504, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit107, Lit505, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit502, Lit88, Lit506, Lit57);
    }

    public Object Card_View1_copy_copy_copy_copy_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit508, "open another screen");
    }

    static Object lambda205() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit88, Lit87, Lit57);
    }

    static Object lambda206() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit511, Lit88, Lit87, Lit57);
    }

    static Object lambda207() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit514, Lit88, Lit515, Lit57);
    }

    static Object lambda208() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit514, Lit88, Lit515, Lit57);
    }

    static Object lambda209() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit519, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit128, "&#xf159;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit129, Lit520, Lit57);
    }

    static Object lambda210() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit125, Lit126, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit519, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit128, "&#xf159;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit518, Lit129, Lit520, Lit57);
    }

    static Object lambda211() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit523, Lit88, Lit524, Lit57);
    }

    static Object lambda212() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit523, Lit88, Lit524, Lit57);
    }

    static Object lambda213() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit527, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit527, Lit88, Lit87, Lit57);
    }

    static Object lambda214() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit527, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit527, Lit88, Lit87, Lit57);
    }

    static Object lambda215() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit530, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit530, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit530, Lit88, Lit87, Lit57);
    }

    static Object lambda216() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit530, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit530, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit530, Lit88, Lit87, Lit57);
    }

    static Object lambda217() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit128, "KRW", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit129, Lit534, Lit57);
    }

    static Object lambda218() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit128, "KRW", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit533, Lit129, Lit534, Lit57);
    }

    static Object lambda219() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit537, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit537, Lit128, "G.Kore Wonu", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit537, Lit129, Lit538, Lit57);
    }

    static Object lambda220() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit537, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit537, Lit128, "G.Kore Wonu", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit537, Lit129, Lit538, Lit57);
    }

    static Object lambda221() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit88, Lit87, Lit57);
    }

    static Object lambda222() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit541, Lit88, Lit87, Lit57);
    }

    static Object lambda223() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit544, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit544, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit544, Lit129, Lit545, Lit57);
    }

    static Object lambda224() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit544, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit544, Lit128, "Alış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit544, Lit129, Lit545, Lit57);
    }

    static Object lambda225() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit548, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit548, Lit129, Lit549, Lit57);
    }

    static Object lambda226() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit548, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit548, Lit129, Lit549, Lit57);
    }

    static Object lambda227() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit88, Lit87, Lit57);
    }

    static Object lambda228() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit552, Lit88, Lit87, Lit57);
    }

    static Object lambda229() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit555, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit555, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit555, Lit129, Lit556, Lit57);
    }

    static Object lambda230() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit555, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit555, Lit128, "Satış", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit555, Lit129, Lit556, Lit57);
    }

    static Object lambda231() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit559, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit559, Lit129, Lit560, Lit57);
    }

    static Object lambda232() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit559, Lit128, "0,0000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit559, Lit129, Lit560, Lit57);
    }

    static Object lambda233() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit563, Lit88, Lit564, Lit57);
    }

    static Object lambda234() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit563, Lit88, Lit564, Lit57);
    }

    static Object lambda235() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit64, Lit568, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit86, Lit569, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit107, Lit570, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit88, Lit571, Lit57);
    }

    static Object lambda236() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit64, Lit568, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit86, Lit569, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit107, Lit570, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit567, Lit88, Lit571, Lit57);
    }

    public Object Card_View1_copy_copy_copy_copy_copy_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit573, "open another screen");
    }

    static Object lambda237() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit88, Lit87, Lit57);
    }

    static Object lambda238() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit576, Lit88, Lit87, Lit57);
    }

    static Object lambda239() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit579, Lit88, Lit580, Lit57);
    }

    static Object lambda240() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit579, Lit88, Lit580, Lit57);
    }

    static Object lambda241() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit125, Lit326, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit519, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit128, "&#xf15a;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit129, Lit584, Lit57);
    }

    static Object lambda242() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit125, Lit326, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit519, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit128, "&#xf15a;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit583, Lit129, Lit584, Lit57);
    }

    static Object lambda243() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit587, Lit88, Lit588, Lit57);
    }

    static Object lambda244() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit587, Lit88, Lit588, Lit57);
    }

    static Object lambda245() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit591, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit591, Lit88, Lit87, Lit57);
    }

    static Object lambda246() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit591, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit591, Lit88, Lit87, Lit57);
    }

    static Object lambda247() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit594, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit594, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit594, Lit88, Lit87, Lit57);
    }

    static Object lambda248() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit594, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit594, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit594, Lit88, Lit87, Lit57);
    }

    static Object lambda249() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit128, "BTC", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit129, Lit598, Lit57);
    }

    static Object lambda250() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit128, "BTC", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit597, Lit129, Lit598, Lit57);
    }

    static Object lambda251() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit601, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit601, Lit128, "Bitcoin", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit601, Lit129, Lit602, Lit57);
    }

    static Object lambda252() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit601, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit601, Lit128, "Bitcoin", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit601, Lit129, Lit602, Lit57);
    }

    static Object lambda253() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit88, Lit87, Lit57);
    }

    static Object lambda254() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit605, Lit88, Lit87, Lit57);
    }

    static Object lambda255() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit608, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit608, Lit128, "Fiyat", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit608, Lit129, Lit609, Lit57);
    }

    static Object lambda256() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit608, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit608, Lit128, "Fiyat", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit608, Lit129, Lit609, Lit57);
    }

    static Object lambda257() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit612, Lit128, "0,000000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit612, Lit129, Lit613, Lit57);
    }

    static Object lambda258() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit612, Lit128, "0,000000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit612, Lit129, Lit613, Lit57);
    }

    static Object lambda259() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit616, Lit88, Lit617, Lit57);
    }

    static Object lambda260() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit616, Lit88, Lit617, Lit57);
    }

    static Object lambda261() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit620, Lit88, Lit621, Lit57);
    }

    static Object lambda262() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit620, Lit88, Lit621, Lit57);
    }

    static Object lambda263() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit64, Lit625, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit86, Lit626, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit107, Lit627, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit88, Lit628, Lit57);
    }

    static Object lambda264() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit64, Lit625, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit99, Lit94, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit100, Lit94, Lit57);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit101, Lit94, Lit57);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit102, Lit94, Lit57);
        Object andCoerceProperty$Ex6 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit103, Lit104, Lit57);
        Object andCoerceProperty$Ex7 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit105, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex8 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit86, Lit626, Lit57);
        Object andCoerceProperty$Ex9 = C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit107, Lit627, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit624, Lit88, Lit628, Lit57);
    }

    public Object Card_View1_copy_copy_copy_copy_copy_copy_copy_copy$Click() {
        C1171runtime.setThisForm();
        return C1171runtime.callYailPrimitive(C1171runtime.open$Mnanother$Mnscreen, LList.list1("Cevirici"), Lit630, "open another screen");
    }

    static Object lambda265() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit88, Lit87, Lit57);
    }

    static Object lambda266() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit633, Lit88, Lit87, Lit57);
    }

    static Object lambda267() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit636, Lit88, Lit637, Lit57);
    }

    static Object lambda268() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit636, Lit88, Lit637, Lit57);
    }

    static Object lambda269() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit125, Lit326, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit519, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit128, "&#xf42e;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit129, Lit641, Lit57);
    }

    static Object lambda270() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit123, Lit124, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit125, Lit326, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit127, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex4 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit519, Boolean.FALSE, Lit74);
        Object andCoerceProperty$Ex5 = C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit128, "&#xf42e;", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit640, Lit129, Lit641, Lit57);
    }

    static Object lambda271() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit644, Lit88, Lit645, Lit57);
    }

    static Object lambda272() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit644, Lit88, Lit645, Lit57);
    }

    static Object lambda273() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit648, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit648, Lit88, Lit87, Lit57);
    }

    static Object lambda274() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit648, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit648, Lit88, Lit87, Lit57);
    }

    static Object lambda275() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit651, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit651, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit651, Lit88, Lit87, Lit57);
    }

    static Object lambda276() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit651, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit651, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit651, Lit88, Lit87, Lit57);
    }

    static Object lambda277() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit128, "ETH", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit129, Lit655, Lit57);
    }

    static Object lambda278() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit144, Boolean.TRUE, Lit74);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit123, Lit145, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit128, "ETH", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit654, Lit129, Lit655, Lit57);
    }

    static Object lambda279() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit658, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit658, Lit128, "Ethereum", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit658, Lit129, Lit659, Lit57);
    }

    static Object lambda280() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit658, Lit123, Lit150, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit658, Lit128, "Ethereum", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit658, Lit129, Lit659, Lit57);
    }

    static Object lambda281() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit88, Lit87, Lit57);
    }

    static Object lambda282() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit58, Lit59, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit60, Lit61, Lit57);
        Object andCoerceProperty$Ex3 = C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit86, Lit87, Lit57);
        return C1171runtime.setAndCoerceProperty$Ex(Lit662, Lit88, Lit87, Lit57);
    }

    static Object lambda283() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit665, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit665, Lit128, "Fiyat", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit665, Lit129, Lit666, Lit57);
    }

    static Object lambda284() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit665, Lit123, Lit158, Lit57);
        Object andCoerceProperty$Ex2 = C1171runtime.setAndCoerceProperty$Ex(Lit665, Lit128, "Fiyat", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit665, Lit129, Lit666, Lit57);
    }

    static Object lambda285() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit669, Lit128, "0,000000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit669, Lit129, Lit670, Lit57);
    }

    static Object lambda286() {
        Object andCoerceProperty$Ex = C1171runtime.setAndCoerceProperty$Ex(Lit669, Lit128, "0,000000", Lit54);
        return C1171runtime.setAndCoerceProperty$Ex(Lit669, Lit129, Lit670, Lit57);
    }

    static Object lambda287() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit673, Lit88, Lit674, Lit57);
    }

    static Object lambda288() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit673, Lit88, Lit674, Lit57);
    }

    static Object lambda289() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit677, Lit88, Lit678, Lit57);
    }

    static Object lambda290() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit677, Lit88, Lit678, Lit57);
    }

    public Object dolarAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit162;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit4;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit684, "select list item")), Lit685), Lit54);
    }

    public Object dolarSatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit173;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit7;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit690, "select list item")), Lit691), Lit54);
    }

    public Object euroAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit226;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit9;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit695, "select list item")), Lit696), Lit54);
    }

    public Object euroSatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit237;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit11;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit700, "select list item")), Lit701), Lit54);
    }

    static Object lambda291() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit704, Lit705, Lit706, Lit57);
    }

    static Object lambda292() {
        return C1171runtime.setAndCoerceProperty$Ex(Lit704, Lit705, Lit706, Lit57);
    }

    public Object Clock1$Timer() {
        C1171runtime.setThisForm();
        Object callComponentMethod = C1171runtime.callComponentMethod(Lit4, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/amerikan-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit708);
        Object callComponentMethod2 = C1171runtime.callComponentMethod(Lit7, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/amerikan-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit709);
        Object callComponentMethod3 = C1171runtime.callComponentMethod(Lit9, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/euro", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit710);
        Object callComponentMethod4 = C1171runtime.callComponentMethod(Lit11, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/euro", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit711);
        Object callComponentMethod5 = C1171runtime.callComponentMethod(Lit13, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/sterlin", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit712);
        Object callComponentMethod6 = C1171runtime.callComponentMethod(Lit15, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/sterlin", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit713);
        Object callComponentMethod7 = C1171runtime.callComponentMethod(Lit17, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/kanada-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit714);
        Object callComponentMethod8 = C1171runtime.callComponentMethod(Lit19, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/kanada-dolari", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit715);
        Object callComponentMethod9 = C1171runtime.callComponentMethod(Lit21, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/rus-rublesi", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit716);
        Object callComponentMethod10 = C1171runtime.callComponentMethod(Lit23, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/rus-rublesi", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit717);
        Object callComponentMethod11 = C1171runtime.callComponentMethod(Lit25, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/japon-yeni", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit718);
        Object callComponentMethod12 = C1171runtime.callComponentMethod(Lit27, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/japon-yeni", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit719);
        Object callComponentMethod13 = C1171runtime.callComponentMethod(Lit29, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/guney-kore-wonu", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(1)"), Lit720);
        Object callComponentMethod14 = C1171runtime.callComponentMethod(Lit31, Lit5, LList.list2("https://kur.doviz.com/serbest-piyasa/guney-kore-wonu", "body > div.wrapper > div.kur-page > div.article-content > div.currency-card.relative.bg-blue-gray-9.rounded-md.p-16 > div.flex.justify-between.mt-8 > div.flex.justify-between > div:nth-child(1) > div.text-md.font-semibold.text-white.mt-4 > span:nth-child(3)"), Lit721);
        Object callComponentMethod15 = C1171runtime.callComponentMethod(Lit33, Lit5, LList.list2("https://www.doviz.com/kripto-paralar/bitcoin", "body > div.wrapper > div.kur-page > div.article-content > div:nth-child(1) > div > div.flex.justify-between.mt-8 > div:nth-child(1) > div.text-xl.font-semibold.text-white"), Lit722);
        return C1171runtime.callComponentMethod(Lit35, Lit5, LList.list2("https://www.doviz.com/kripto-paralar/ethereum", "body > div.wrapper > div.kur-page > div.article-content > div:nth-child(1) > div > div.flex.justify-between.mt-8 > div:nth-child(1) > div.text-xl.font-semibold.text-white"), Lit723);
    }

    public Object sterlinAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit290;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit13;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit728, "select list item")), Lit729), Lit54);
    }

    public Object sterlinSatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit301;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit15;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit733, "select list item")), Lit734), Lit54);
    }

    public Object canadaAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit355;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit17;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit738, "select list item")), Lit739), Lit54);
    }

    public Object canadaSatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit366;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit19;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit743, "select list item")), Lit744), Lit54);
    }

    public Object rubleAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit419;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit21;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit748, "select list item")), Lit749), Lit54);
    }

    public Object rubleSatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit430;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit23;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit753, "select list item")), Lit754), Lit54);
    }

    public Object jpyAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit483;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit25;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit758, "select list item")), Lit759), Lit54);
    }

    public Object jpySatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit494;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit27;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit763, "select list item")), Lit764), Lit54);
    }

    public Object wonAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit548;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit29;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit768, "select list item")), Lit769), Lit54);
    }

    public Object wonSatis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit559;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit31;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit773, "select list item")), Lit774), Lit54);
    }

    public Object btcAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit612;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit33;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit781, "select list item")), Lit782), Lit54);
    }

    public Object ethAlis$GotElements(Object $elements) {
        Object obj;
        Object $elements2 = C1171runtime.sanitizeComponentData($elements);
        C1171runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit669;
        SimpleSymbol simpleSymbol2 = Lit128;
        SimpleSymbol simpleSymbol3 = Lit35;
        SimpleSymbol simpleSymbol4 = Lit682;
        ModuleMethod moduleMethod = C1171runtime.yail$Mnlist$Mnget$Mnitem;
        if ($elements2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1171runtime.getDisplayRepresentation(Lit683);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1171runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $elements2;
        }
        return C1171runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1171runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list1(C1171runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit80), Lit786, "select list item")), Lit787), Lit54);
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
        Screen1 = this;
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

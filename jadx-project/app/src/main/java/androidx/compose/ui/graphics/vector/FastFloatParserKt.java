package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastFloatParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0019\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0082\b\u001a \u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0001H\u0000\u001a\u0019\u0010%\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0012H\u0082\b\u001a\u0019\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0001H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\u0010\n\u0002\u0010\u000b\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\u0010\"\u0019\u0010\u0011\u001a\u00020\u0012*\u00020\u00138À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0019\u0010\u0016\u001a\u00020\u0001*\u00020\u00138À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001b8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001c¨\u0006*"}, d2 = {"FloatMaxExponent", "", "FloatMaxExponentNumber", "FloatMinExponent", "FloatSmallestExponent", "Mantissa64", "Lkotlin/ULongArray;", "getMantissa64$annotations", "()V", "getMantissa64", "()[J", "[J", "PowersOfTen", "", "getPowersOfTen$annotations", "getPowersOfTen", "()[F", "floatValue", "", "", "getFloatValue", "(J)F", "index", "getIndex", "(J)I", "isDigit", "", "", "(C)Z", "fullMultiplicationHighBits", "x", "y", "nextFloat", "s", "", "start", "end", "pack", "value", "parseFourDigits", "str", "offset", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FastFloatParserKt {
    private static final int FloatMaxExponent = 10;
    private static final int FloatMaxExponentNumber = 1024;
    private static final int FloatMinExponent = -10;
    private static final int FloatSmallestExponent = -325;
    private static final long[] Mantissa64 = null;
    private static final float[] PowersOfTen = null;

    public static /* synthetic */ void getMantissa64$annotations() {
    }

    public static /* synthetic */ void getPowersOfTen$annotations() {
    }

    public static final float[] getPowersOfTen() {
        return PowersOfTen;
    }

    static {
        PowersOfTen = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        Mantissa64 = new long[]{-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    }

    public static final int getIndex(long $this$index) {
        return (int) ($this$index >>> 32);
    }

    public static final float getFloatValue(long $this$floatValue) {
        int bits$iv = (int) (4294967295L & $this$floatValue);
        return Float.intBitsToFloat(bits$iv);
    }

    public static final long nextFloat(String s, int start, int end) {
        char r5 = ' ';
        if (start == end) goto L5;
        int index = start;
        char c = s.charAt(index);
        if (c != '-') goto L9;
        boolean isNegative = true;
    L11:
        if (isNegative == false) goto L24;
        index = index + 1;
        if (index == end) goto L15;
        c = s.charAt(index);
        long r16 = 4294967295L;
        if (((char) (c - '0')) >= '\n') goto L19;
        boolean r3 = true;
    L20:
        if (r3 == true) goto L25;
        if (c == '.') goto L25;
        return (((long) index) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
    L25:
        long significand = 0;
        int significandStartIndex = index;
        int dataLength = s.length();
    L27:
        if (index == end) goto L38;
        char $this$isDigit$iv = c;
        char r22 = r5;
        if (((char) ($this$isDigit$iv - '0')) >= '\n') goto L31;
        boolean r6 = true;
    L32:
        if (r6 == false) goto L39;
        significand = (10 * significand) + ((long) (c - '0'));
        index = index + 1;
        if (index >= dataLength) goto L36;
        char r7 = s.charAt(index);
    L37:
        c = r7;
        r5 = r22;
        goto L27
    L36:
        r7 = 0;
    L39:
        int significandEndIndex = index;
        int digitCount = index - significandStartIndex;
        int exponent = 0;
        int exponentStartIndex = index;
        int exponentEndIndex = index;
        long r26 = 0;
        if (index == end) goto L69;
        if (c != '.') goto L69;
        index = index + 1;
        exponentStartIndex = index;
    L43:
        char r30 = '0';
        if ((end - index) < 4) goto L52;
        int significandStartIndex2 = significandStartIndex;
        long r13 = s.charAt(index);
        long significand2 = significand;
        long significand3 = s.charAt(index + 1);
        long v$iv = (((significand3 << 16) | r13) | (((long) s.charAt(index + 2)) << r22)) | (((long) s.charAt(index + 3)) << 48);
        long base$iv = v$iv - 13511005043687472L;
        long predicate$iv = (v$iv + 19703549022044230L) | base$iv;
        if ((predicate$iv & (-35747867511423104L)) == 0) goto L48;
        int digits = -1;
    L50:
        if (digits < 0) goto L53;
        significand = (10000 * significand2) + ((long) digits);
        index = index + 4;
        significandStartIndex = significandStartIndex2;
    L53:
        if (index >= dataLength) goto L55;
        char r4 = s.charAt(index);
    L56:
        c = r4;
        long significand4 = significand2;
    L57:
        if (index == end) goto L68;
        char $this$isDigit$iv2 = c;
        if (((char) ($this$isDigit$iv2 - '0')) >= '\n') goto L61;
        char $this$isDigit$iv3 = 1;
    L62:
        if ($this$isDigit$iv3 == 0) goto L68;
        long r12 = significand4 * 10;
        long significand5 = c - '0';
        significand4 = significand5 + r12;
        index = index + 1;
        if (index >= dataLength) goto L66;
        char r8 = s.charAt(index);
    L67:
        c = r8;
        goto L57
    L66:
        r8 = 0;
        goto L67
    L61:
        $this$isDigit$iv3 = 0;
    L68:
        exponent = exponentStartIndex - index;
        int exponentEndIndex2 = index;
        digitCount = digitCount - exponent;
        significand = significand4;
        int exponentEndIndex3 = exponentEndIndex2;
    L70:
        if (digitCount != 0) goto L73;
        long significand6 = index;
        return (significand6 << r22) | (((long) Float.floatToRawIntBits(Float.NaN)) & r16);
    L73:
        long significand7 = significand;
        int exponentNumber = 0;
        if ((c | ' ') != 101) goto L107;
        index = index + 1;
        if (index >= dataLength) goto L78;
        char c2 = s.charAt(index);
    L80:
        if (c2 != '-') goto L82;
        boolean isExponentNegative = true;
    L83:
        if (isExponentNegative == false) goto L85;
    L86:
        index = index + 1;
    L87:
        char c3 = s.charAt(index);
    L88:
        if (index == end) goto L102;
        char $this$isDigit$iv4 = c3;
        char c4 = c3;
        if (((char) ($this$isDigit$iv4 - '0')) >= '\n') goto L92;
        char $this$isDigit$iv5 = 1;
    L93:
        if ($this$isDigit$iv5 == 0) goto L103;
        if (exponentNumber >= 1024) goto L97;
        exponentNumber = (exponentNumber * 10) + (c4 - '0');
    L97:
        index = index + 1;
        if (index >= dataLength) goto L100;
        char r14 = s.charAt(index);
    L101:
        c3 = r14;
        goto L88
    L100:
        r14 = 0;
    L103:
        if (isExponentNegative == false) goto L105;
        exponentNumber = -exponentNumber;
    L105:
        exponent = exponent + exponentNumber;
        c = c4;
        goto L107
    L92:
        $this$isDigit$iv5 = 0;
        goto L93
    L102:
        c4 = c3;
        goto L103
    L85:
        if (c2 != '+') goto L87;
    L82:
        isExponentNegative = false;
        goto L83
    L78:
        c2 = 0;
    L107:
        if (digitCount <= 19) goto L151;
        int retryIndex = significandStartIndex2;
        c = s.charAt(retryIndex);
    L109:
        if (index == end) goto L124;
        char r15 = r30;
        if (c == r15) goto L116;
        if (c != '.') goto L124;
    L116:
        if (c != r15) goto L118;
        digitCount = digitCount - 1;
    L118:
        retryIndex = retryIndex + 1;
        if (retryIndex >= dataLength) goto L121;
        char r28 = s.charAt(retryIndex);
    L122:
        c = r28;
        r30 = r15;
        goto L109
    L121:
        r28 = 0;
    L124:
        if (digitCount <= 19) goto L150;
        long significand8 = 0;
        int retryIndex2 = significandStartIndex2;
        c = s.charAt(retryIndex2);
    L126:
        long r17 = 1000000000000000000L;
        if (retryIndex2 == significandEndIndex) goto L135;
        int exponentNumber2 = exponentNumber;
        if (Long.compareUnsigned(ULong.m7599constructorimpl(significand8), 1000000000000000000L) >= 0) goto L137;
        significand8 = (significand8 * 10) + ((long) (c - '0'));
        retryIndex2 = retryIndex2 + 1;
        if (retryIndex2 >= dataLength) goto L133;
        char r2 = s.charAt(retryIndex2);
    L134:
        c = r2;
        exponentNumber = exponentNumber2;
        goto L126
    L133:
        r2 = 0;
    L137:
        if (Long.compareUnsigned(ULong.m7599constructorimpl(significand8), 1000000000000000000L) < 0) goto L139;
        exponent = (significandEndIndex - retryIndex2) + exponentNumber2;
        boolean tooManyDigits = true;
        long significand9 = significand8;
    L153:
        if (FloatMinExponent <= exponent) goto L155;
    L157:
        boolean r18 = false;
    L158:
        if (r18 == false) goto L175;
        if (tooManyDigits == true) goto L175;
        if (Long.compareUnsigned(ULong.m7599constructorimpl(significand9), ULong.m7599constructorimpl(16777216)) > 0) goto L175;
        float f = significand9;
        if (exponent >= 0) goto L165;
        float f2 = f / PowersOfTen[-exponent];
    L166:
        if (isNegative == false) goto L168;
        float value$iv = -f2;
    L170:
        return (((long) index) << r22) | (((long) Float.floatToRawIntBits(value$iv)) & r16);
    L168:
        value$iv = f2;
        goto L170
    L165:
        f2 = f * PowersOfTen[exponent];
    L175:
        if (significand9 != 0) goto L182;
        if (isNegative == false) goto L178;
        float value$iv2 = -0.0f;
    L180:
        return (((long) index) << r22) | (((long) Float.floatToRawIntBits(value$iv2)) & r16);
    L178:
        value$iv2 = 0.0f;
        goto L180
    L182:
        if ((-126) <= exponent) goto L184;
    L186:
        boolean r20 = false;
    L188:
        if (r20 == true) goto L191;
        String r9 = s.substring(start, index);
        Intrinsics.checkNotNullExpressionValue(r9, "substring(...)");
        float value$iv3 = Float.parseFloat(r9);
        return (((long) index) << r22) | (((long) Float.floatToRawIntBits(value$iv3)) & r16);
    L191:
        long significandFactor = ULongArray.m7659getsVKNKU(Mantissa64, exponent + 325);
        int lz = Long.numberOfLeadingZeros(significand9);
        long significand10 = significand9 << lz;
        long xLo$iv = significand10 & r16;
        long xHi$iv = significand10 >>> r22;
        long yLo$iv = significandFactor & r16;
        long yHi$iv = significandFactor >>> r22;
        long xTimesYHi$iv = xHi$iv * yHi$iv;
        long xTimesYMid$iv = xLo$iv * yHi$iv;
        long yTimesXMid$iv = xHi$iv * yLo$iv;
        long xTimesYLo$iv = xLo$iv * yLo$iv;
        long carry$iv = (yTimesXMid$iv + (xTimesYLo$iv >>> r22)) + (xTimesYMid$iv & r16);
        long upper = (xTimesYHi$iv + (carry$iv >>> r22)) + (xTimesYMid$iv >>> r22);
        int upperBit = (int) (upper >>> 63);
        long mantissa = upper >>> (upperBit + 9);
        int lz2 = lz + (upperBit ^ 1);
        if ((upper & 511) == 511) goto L215;
        if ((upper & 511) == 0) goto L196;
    L198:
        long mantissa2 = (mantissa + 1) >>> 1;
        if (mantissa2 < 9007199254740992L) goto L201;
        mantissa2 = 4503599627370496L;
        lz2 = lz2 - 1;
    L201:
        long mantissa3 = mantissa2 & (-4503599627370497L);
        long adjustedExponent = (((((long) exponent) * 217706) >> 16) + 1024) + 63;
        long adjustedExponent2 = lz2;
        long realExponent = adjustedExponent - adjustedExponent2;
        if (realExponent < 1) goto L212;
        if (realExponent > 2046) goto L212;
        long mantissa4 = mantissa3 | (realExponent << 52);
        if (isNegative == false) goto L209;
        r26 = Long.MIN_VALUE;
    L209:
        float value$iv4 = (float) Double.longBitsToDouble(mantissa4 | r26);
        return (((long) index) << r22) | (((long) Float.floatToRawIntBits(value$iv4)) & r16);
    L212:
        String r10 = s.substring(start, index);
        Intrinsics.checkNotNullExpressionValue(r10, "substring(...)");
        float value$iv5 = Float.parseFloat(r10);
        return (((long) index) << r22) | (((long) Float.floatToRawIntBits(value$iv5)) & r16);
    L196:
        if ((mantissa & 3) != 1) goto L198;
    L215:
        String r11 = s.substring(start, index);
        Intrinsics.checkNotNullExpressionValue(r11, "substring(...)");
        float value$iv6 = Float.parseFloat(r11);
        return (((long) Float.floatToRawIntBits(value$iv6)) & r16) | (((long) index) << r22);
    L184:
        if (exponent >= 128) goto L186;
        r20 = true;
        goto L188
    L155:
        if (exponent >= 11) goto L157;
        r18 = true;
        goto L158
    L139:
        int retryIndex3 = exponentStartIndex;
        c = s.charAt(retryIndex3);
    L140:
        if (retryIndex3 == exponentEndIndex3) goto L148;
        int retryIndex4 = retryIndex3;
        if (Long.compareUnsigned(ULong.m7599constructorimpl(significand8), r17) >= 0) goto L149;
        significand8 = (significand8 * 10) + ((long) (c - '0'));
        retryIndex3 = retryIndex4 + 1;
        if (retryIndex3 >= dataLength) goto L146;
        char r19 = s.charAt(retryIndex3);
    L147:
        c = r19;
        r17 = 1000000000000000000L;
        goto L140
    L146:
        r19 = 0;
    L149:
        exponent = (exponentStartIndex - retryIndex4) + exponentNumber2;
        tooManyDigits = true;
        significand9 = significand8;
        goto L153
    L148:
        retryIndex4 = retryIndex3;
        goto L149
    L135:
        exponentNumber2 = exponentNumber;
        goto L137
    L150:
        tooManyDigits = false;
        significand9 = significand7;
        goto L153
    L151:
        tooManyDigits = false;
        significand9 = significand7;
        goto L153
    L55:
        r4 = 0;
        goto L56
    L48:
        digits = (int) ((281475406208040961L * base$iv) >>> 48);
        goto L50
    L52:
        significand2 = significand;
        significandStartIndex2 = significandStartIndex;
    L69:
        significandStartIndex2 = significandStartIndex;
        r30 = '0';
        exponentEndIndex3 = exponentEndIndex;
        goto L70
    L31:
        r6 = false;
        goto L32
    L38:
        r22 = r5;
        goto L39
    L19:
        r3 = false;
        goto L20
    L15:
        return (4294967295L & ((long) Float.floatToRawIntBits(Float.NaN))) | (((long) index) << 32);
    L24:
        r16 = 4294967295L;
        goto L25
    L9:
        isNegative = false;
        goto L11
    L5:
        return (4294967295L & ((long) Float.floatToRawIntBits(Float.NaN))) | (((long) start) << 32);
    }

    public static final long[] getMantissa64() {
        return Mantissa64;
    }

    public static final boolean isDigit(char $this$isDigit) {
        if (((char) ($this$isDigit - '0')) >= '\n') goto L5;
        return true;
    L5:
        return false;
    }

    private static final long pack(int index, float value) {
        return (((long) index) << 32) | (((long) Float.floatToRawIntBits(value)) & 4294967295L);
    }

    private static final long fullMultiplicationHighBits(long x, long y) {
        long xLo = x & 4294967295L;
        long xHi = x >>> 32;
        long yLo = y & 4294967295L;
        long yHi = y >>> 32;
        long xTimesYHi = xHi * yHi;
        long xTimesYMid = xLo * yHi;
        long yTimesXMid = xHi * yLo;
        long xTimesYLo = xLo * yLo;
        long carry = (yTimesXMid + (xTimesYLo >>> 32)) + (4294967295L & xTimesYMid);
        return ((carry >>> 32) + xTimesYHi) + (xTimesYMid >>> 32);
    }

    private static final int parseFourDigits(String str, int offset) {
        long v = ((((long) str.charAt(offset)) | (((long) str.charAt(offset + 1)) << 16)) | (((long) str.charAt(offset + 2)) << 32)) | (((long) str.charAt(offset + 3)) << 48);
        long base = v - 13511005043687472L;
        long predicate = (19703549022044230L + v) | base;
        if (((-35747867511423104L) & predicate) == 0) goto L6;
        return -1;
    L6:
        return (int) ((281475406208040961L * base) >>> 48);
    }
}

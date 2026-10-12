package androidx.compose.ui.autofill;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AutofillType.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Use the new semantics-based API and androidx.compose.ui.autofill.ContentType instead.")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b&\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Landroidx/compose/ui/autofill/AutofillType;", "", "(Ljava/lang/String;I)V", "EmailAddress", "Username", "Password", "NewUsername", "NewPassword", "PostalAddress", "PostalCode", "CreditCardNumber", "CreditCardSecurityCode", "CreditCardExpirationDate", "CreditCardExpirationMonth", "CreditCardExpirationYear", "CreditCardExpirationDay", "AddressCountry", "AddressRegion", "AddressLocality", "AddressStreet", "AddressAuxiliaryDetails", "PostalCodeExtended", "PersonFullName", "PersonFirstName", "PersonLastName", "PersonMiddleName", "PersonMiddleInitial", "PersonNamePrefix", "PersonNameSuffix", "PhoneNumber", "PhoneNumberDevice", "PhoneCountryCode", "PhoneNumberNational", "Gender", "BirthDateFull", "BirthDateDay", "BirthDateMonth", "BirthDateYear", "SmsOtpCode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum AutofillType extends Enum<AutofillType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AutofillType[] $VALUES = null;
    public static final AutofillType AddressAuxiliaryDetails = null;
    public static final AutofillType AddressCountry = null;
    public static final AutofillType AddressLocality = null;
    public static final AutofillType AddressRegion = null;
    public static final AutofillType AddressStreet = null;
    public static final AutofillType BirthDateDay = null;
    public static final AutofillType BirthDateFull = null;
    public static final AutofillType BirthDateMonth = null;
    public static final AutofillType BirthDateYear = null;
    public static final AutofillType CreditCardExpirationDate = null;
    public static final AutofillType CreditCardExpirationDay = null;
    public static final AutofillType CreditCardExpirationMonth = null;
    public static final AutofillType CreditCardExpirationYear = null;
    public static final AutofillType CreditCardNumber = null;
    public static final AutofillType CreditCardSecurityCode = null;
    public static final AutofillType EmailAddress = null;
    public static final AutofillType Gender = null;
    public static final AutofillType NewPassword = null;
    public static final AutofillType NewUsername = null;
    public static final AutofillType Password = null;
    public static final AutofillType PersonFirstName = null;
    public static final AutofillType PersonFullName = null;
    public static final AutofillType PersonLastName = null;
    public static final AutofillType PersonMiddleInitial = null;
    public static final AutofillType PersonMiddleName = null;
    public static final AutofillType PersonNamePrefix = null;
    public static final AutofillType PersonNameSuffix = null;
    public static final AutofillType PhoneCountryCode = null;
    public static final AutofillType PhoneNumber = null;
    public static final AutofillType PhoneNumberDevice = null;
    public static final AutofillType PhoneNumberNational = null;
    public static final AutofillType PostalAddress = null;
    public static final AutofillType PostalCode = null;
    public static final AutofillType PostalCodeExtended = null;
    public static final AutofillType SmsOtpCode = null;
    public static final AutofillType Username = null;

    private static final /* synthetic */ AutofillType[] $values() {
        return new AutofillType[]{EmailAddress, Username, Password, NewUsername, NewPassword, PostalAddress, PostalCode, CreditCardNumber, CreditCardSecurityCode, CreditCardExpirationDate, CreditCardExpirationMonth, CreditCardExpirationYear, CreditCardExpirationDay, AddressCountry, AddressRegion, AddressLocality, AddressStreet, AddressAuxiliaryDetails, PostalCodeExtended, PersonFullName, PersonFirstName, PersonLastName, PersonMiddleName, PersonMiddleInitial, PersonNamePrefix, PersonNameSuffix, PhoneNumber, PhoneNumberDevice, PhoneCountryCode, PhoneNumberNational, Gender, BirthDateFull, BirthDateDay, BirthDateMonth, BirthDateYear, SmsOtpCode};
    }

    public static EnumEntries<AutofillType> getEntries() {
        return $ENTRIES;
    }

    public static AutofillType valueOf(String r1) {
        return (AutofillType) Enum.valueOf(AutofillType.class, r1);
    }

    public static AutofillType[] values() {
        return (AutofillType[]) $VALUES.clone();
    }

    private AutofillType(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        EmailAddress = new AutofillType("EmailAddress", 0);
        Username = new AutofillType("Username", 1);
        Password = new AutofillType("Password", 2);
        NewUsername = new AutofillType("NewUsername", 3);
        NewPassword = new AutofillType("NewPassword", 4);
        PostalAddress = new AutofillType("PostalAddress", 5);
        PostalCode = new AutofillType("PostalCode", 6);
        CreditCardNumber = new AutofillType("CreditCardNumber", 7);
        CreditCardSecurityCode = new AutofillType("CreditCardSecurityCode", 8);
        CreditCardExpirationDate = new AutofillType("CreditCardExpirationDate", 9);
        CreditCardExpirationMonth = new AutofillType("CreditCardExpirationMonth", 10);
        CreditCardExpirationYear = new AutofillType("CreditCardExpirationYear", 11);
        CreditCardExpirationDay = new AutofillType("CreditCardExpirationDay", 12);
        AddressCountry = new AutofillType("AddressCountry", 13);
        AddressRegion = new AutofillType("AddressRegion", 14);
        AddressLocality = new AutofillType("AddressLocality", 15);
        AddressStreet = new AutofillType("AddressStreet", 16);
        AddressAuxiliaryDetails = new AutofillType("AddressAuxiliaryDetails", 17);
        PostalCodeExtended = new AutofillType("PostalCodeExtended", 18);
        PersonFullName = new AutofillType("PersonFullName", 19);
        PersonFirstName = new AutofillType("PersonFirstName", 20);
        PersonLastName = new AutofillType("PersonLastName", 21);
        PersonMiddleName = new AutofillType("PersonMiddleName", 22);
        PersonMiddleInitial = new AutofillType("PersonMiddleInitial", 23);
        PersonNamePrefix = new AutofillType("PersonNamePrefix", 24);
        PersonNameSuffix = new AutofillType("PersonNameSuffix", 25);
        PhoneNumber = new AutofillType("PhoneNumber", 26);
        PhoneNumberDevice = new AutofillType("PhoneNumberDevice", 27);
        PhoneCountryCode = new AutofillType("PhoneCountryCode", 28);
        PhoneNumberNational = new AutofillType("PhoneNumberNational", 29);
        Gender = new AutofillType("Gender", 30);
        BirthDateFull = new AutofillType("BirthDateFull", 31);
        BirthDateDay = new AutofillType("BirthDateDay", 32);
        BirthDateMonth = new AutofillType("BirthDateMonth", 33);
        BirthDateYear = new AutofillType("BirthDateYear", 34);
        SmsOtpCode = new AutofillType("SmsOtpCode", 35);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}

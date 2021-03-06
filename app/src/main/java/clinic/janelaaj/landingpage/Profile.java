package clinic.janelaaj.landingpage;

import android.graphics.Bitmap;

import java.sql.Blob;

public class Profile {
    private String mDoctorid;
    private String mDoctorName;
    private String mGender;
    private String mExperience;
    private String mSpeciality;
    private Bitmap mDoctorPhoto;
    private String mMbbsflag;
    private String mMdflag;
    private String mMsflag;
    private String mCliniclocationname;
    private String mAddressline1;
    private String mAddressline2;
    private String mCity;
    private String mPincode;
    private String mRating;
    private String mNormalamount;
    private String mDiscountedamount;
    private String mDiscountflag;

    public Profile(String doctorid, String doctorname, String gender, String experience, String speciality, Bitmap doctorPhoto, String mbbsflag, String mdflag, String msflag, String cliniclocationname, String addressline1, String addressline2, String city, String pincode, String rating, String normalamount, String discountedamount, String discountflag) {
        mDoctorid = doctorid;
        mDoctorName = doctorname;
        mGender = gender;
        mExperience = experience;
        mSpeciality = speciality;
        mDoctorPhoto = doctorPhoto;
        mMbbsflag = mbbsflag;
        mMdflag = mdflag;
        mMsflag = msflag;
        mCliniclocationname = cliniclocationname;
        mAddressline1 = addressline1;
        mAddressline2 = addressline2;
        mCity = city;
        mPincode = pincode;
        mRating = rating;
        mNormalamount = normalamount;
        mDiscountedamount = discountedamount;
        mDiscountflag = discountflag;
    }

    public String getDoctorid() {
        return mDoctorid;
    }

    public String getDoctorName() {
        return mDoctorName;
    }

    public String getGender() {
        return mGender;
    }

    public String getExperience() {
        return mExperience;
    }

    public String getSpeciality() {
        return mSpeciality;
    }

    public Bitmap getDoctorPhoto() {
        return mDoctorPhoto;
    }

    public String getMbbsflag() {
        return mMbbsflag;
    }

    public String getMdflag() {
        return mMdflag;
    }

    public String getMsflag() {
        return mMsflag;
    }

    public String getCliniclocationname() {
        return mCliniclocationname;
    }

    public String getAddressline1() {
        return mAddressline1;
    }

    public String getAddressline2() {
        return mAddressline2;
    }

    public String getCity() {
        return mCity;
    }

    public String getPincode() {
        return mPincode;
    }

    public String getRating() {
        return mRating;
    }

    public String getNormalamount() {
        return mNormalamount;
    }

    public String getDiscountedamount() {
        return mDiscountedamount;
    }

    public String getDiscountflag() {
        return mDiscountflag;
    }
}

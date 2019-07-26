package com.gcoders.schoolinfo.schoolsfindersystem.model

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SchoolListInfo protected constructor(parcel: Parcel) : Parcelable {

    @SerializedName("academicopportunities1")
    @Expose
    var academicopportunities1: String? = null
    @SerializedName("academicopportunities2")
    @Expose
    var academicopportunities2: String? = null
    @SerializedName("academicopportunities3")
    @Expose
    var academicopportunities3: String? = null
    @SerializedName("academicopportunities4")
    @Expose
    var academicopportunities4: String? = null
    @SerializedName("academicopportunities5")
    @Expose
    var academicopportunities5: String? = null
    @SerializedName("addtl_info1")
    @Expose
    var addtlInfo1: String? = null
    @SerializedName("admissionspriority11")
    @Expose
    var admissionspriority11: String? = null
    @SerializedName("admissionspriority21")
    @Expose
    var admissionspriority21: String? = null
    @SerializedName("attendance_rate")
    @Expose
    var attendanceRate: String? = null
    @SerializedName("bbl")
    @Expose
    var bbl: String? = null
    @SerializedName("bin")
    @Expose
    var bin: String? = null
    @SerializedName("boro")
    @Expose
    var boro: String? = null
    @SerializedName("borough")
    @Expose
    var borough: String? = null
    @SerializedName("building_code")
    @Expose
    var buildingCode: String? = null
    @SerializedName("bus")
    @Expose
    var bus: String? = null
    @SerializedName("census_tract")
    @Expose
    var censusTract: String? = null
    @SerializedName("city")
    @Expose
    var city: String? = null
    @SerializedName("code1")
    @Expose
    var code1: String? = null
    @SerializedName("college_career_rate")
    @Expose
    var collegeCareerRate: String? = null
    @SerializedName("community_board")
    @Expose
    var communityBoard: String? = null
    @SerializedName("council_district")
    @Expose
    var councilDistrict: String? = null
    @SerializedName("dbn")
    @Expose
    var dbn: String? = null
    @SerializedName("diplomaendorsements")
    @Expose
    var diplomaendorsements: String? = null
    @SerializedName("eligibility1")
    @Expose
    var eligibility1: String? = null
    @SerializedName("ell_programs")
    @Expose
    var ellPrograms: String? = null
    @SerializedName("end_time")
    @Expose
    var endTime: String? = null
    @SerializedName("extracurricular_activities")
    @Expose
    var extracurricularActivities: String? = null
    @SerializedName("fax_number")
    @Expose
    var faxNumber: String? = null
    @SerializedName("finalgrades")
    @Expose
    var finalgrades: String? = null
    @SerializedName("girls")
    @Expose
    var girls: String? = null
    @SerializedName("grade9geapplicants1")
    @Expose
    var grade9geapplicants1: String? = null
    @SerializedName("grade9geapplicantsperseat1")
    @Expose
    var grade9geapplicantsperseat1: String? = null
    @SerializedName("grade9gefilledflag1")
    @Expose
    var grade9gefilledflag1: String? = null
    @SerializedName("grade9swdapplicants1")
    @Expose
    var grade9swdapplicants1: String? = null
    @SerializedName("grade9swdapplicantsperseat1")
    @Expose
    var grade9swdapplicantsperseat1: String? = null
    @SerializedName("grade9swdfilledflag1")
    @Expose
    var grade9swdfilledflag1: String? = null
    @SerializedName("grades2018")
    @Expose
    var grades2018: String? = null
    @SerializedName("graduation_rate")
    @Expose
    var graduationRate: String? = null
    @SerializedName("interest1")
    @Expose
    var interest1: String? = null
    @SerializedName("language_classes")
    @Expose
    var languageClasses: String? = null
    @SerializedName("latitude")
    @Expose
    var latitude: String? = null
    @SerializedName("location")
    @Expose
    var location: String? = null
    @SerializedName("longitude")
    @Expose
    var longitude: String? = null
    @SerializedName("method1")
    @Expose
    var method1: String? = null
    @SerializedName("neighborhood")
    @Expose
    var neighborhood: String? = null
    @SerializedName("nta")
    @Expose
    var nta: String? = null
    @SerializedName("offer_rate1")
    @Expose
    var offerRate1: String? = null
    @SerializedName("overview_paragraph")
    @Expose
    var overviewParagraph: String? = null
    @SerializedName("pct_stu_enough_variety")
    @Expose
    var pctStuEnoughVariety: String? = null
    @SerializedName("pct_stu_safe")
    @Expose
    var pctStuSafe: String? = null
    @SerializedName("phone_number")
    @Expose
    var phoneNumber: String? = null
    @SerializedName("primary_address_line_1")
    @Expose
    var primaryAddressLine1: String? = null
    @SerializedName("program1")
    @Expose
    var program1: String? = null
    @SerializedName("psal_sports_boys")
    @Expose
    var psalSportsBoys: String? = null
    @SerializedName("psal_sports_coed")
    @Expose
    var psalSportsCoed: String? = null
    @SerializedName("psal_sports_girls")
    @Expose
    var psalSportsGirls: String? = null
    @SerializedName("school_accessibility_description")
    @Expose
    var schoolAccessibilityDescription: String? = null
    @SerializedName("school_email")
    @Expose
    var schoolEmail: String? = null
    @SerializedName("school_name")
    @Expose
    var schoolName: String? = null
    @SerializedName("seats101")
    @Expose
    var seats101: String? = null
    @SerializedName("seats9ge1")
    @Expose
    var seats9ge1: String? = null
    @SerializedName("seats9swd1")
    @Expose
    var seats9swd1: String? = null
    @SerializedName("shared_space")
    @Expose
    var sharedSpace: String? = null
    @SerializedName("start_time")
    @Expose
    var startTime: String? = null
    @SerializedName("state_code")
    @Expose
    var stateCode: String? = null
    @SerializedName("subway")
    @Expose
    var subway: String? = null
    @SerializedName("total_students")
    @Expose
    var totalStudents: String? = null
    @SerializedName("website")
    @Expose
    var website: String? = null
    @SerializedName("zip")
    @Expose
    var zip: String? = null
    @SerializedName("advancedplacement_courses")
    @Expose
    var advancedplacementCourses: String? = null
    @SerializedName("campus_name")
    @Expose
    var campusName: String? = null
    @SerializedName("international")
    @Expose
    var international: String? = null
    @SerializedName("pbat")
    @Expose
    var pbat: String? = null
    @SerializedName("school_10th_seats")
    @Expose
    var school10thSeats: String? = null
    @SerializedName("school_sports")
    @Expose
    var schoolSports: String? = null


    init {
        academicopportunities1 = parcel.readString()
        academicopportunities2 = parcel.readString()
        academicopportunities3 = parcel.readString()
        academicopportunities4 = parcel.readString()
        academicopportunities5 = parcel.readString()
        addtlInfo1 = parcel.readString()
        admissionspriority11 = parcel.readString()
        admissionspriority21 = parcel.readString()
        attendanceRate = parcel.readString()
        bbl = parcel.readString()
        bin = parcel.readString()
        boro = parcel.readString()
        borough = parcel.readString()
        buildingCode = parcel.readString()
        bus = parcel.readString()
        censusTract = parcel.readString()
        city = parcel.readString()
        code1 = parcel.readString()
        collegeCareerRate = parcel.readString()
        communityBoard = parcel.readString()
        councilDistrict = parcel.readString()
        dbn = parcel.readString()
        diplomaendorsements = parcel.readString()
        eligibility1 = parcel.readString()
        ellPrograms = parcel.readString()
        endTime = parcel.readString()
        extracurricularActivities = parcel.readString()
        faxNumber = parcel.readString()
        finalgrades = parcel.readString()
        girls = parcel.readString()
        grade9geapplicants1 = parcel.readString()
        grade9geapplicantsperseat1 = parcel.readString()
        grade9gefilledflag1 = parcel.readString()
        grade9swdapplicants1 = parcel.readString()
        grade9swdapplicantsperseat1 = parcel.readString()
        grade9swdfilledflag1 = parcel.readString()
        grades2018 = parcel.readString()
        graduationRate = parcel.readString()
        interest1 = parcel.readString()
        languageClasses = parcel.readString()
        latitude = parcel.readString()
        location = parcel.readString()
        longitude = parcel.readString()
        method1 = parcel.readString()
        neighborhood = parcel.readString()
        nta = parcel.readString()
        offerRate1 = parcel.readString()
        overviewParagraph = parcel.readString()
        pctStuEnoughVariety = parcel.readString()
        pctStuSafe = parcel.readString()
        phoneNumber = parcel.readString()
        primaryAddressLine1 = parcel.readString()
        program1 = parcel.readString()
        psalSportsBoys = parcel.readString()
        psalSportsCoed = parcel.readString()
        psalSportsGirls = parcel.readString()
        schoolAccessibilityDescription = parcel.readString()
        schoolEmail = parcel.readString()
        schoolName = parcel.readString()
        seats101 = parcel.readString()
        seats9ge1 = parcel.readString()
        seats9swd1 = parcel.readString()
        sharedSpace = parcel.readString()
        startTime = parcel.readString()
        stateCode = parcel.readString()
        subway = parcel.readString()
        totalStudents = parcel.readString()
        website = parcel.readString()
        zip = parcel.readString()
        advancedplacementCourses = parcel.readString()
        campusName = parcel.readString()
        international = parcel.readString()
        pbat = parcel.readString()
        school10thSeats = parcel.readString()
        schoolSports = parcel.readString()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(academicopportunities1)
        dest.writeString(academicopportunities2)
        dest.writeString(academicopportunities3)
        dest.writeString(academicopportunities4)
        dest.writeString(academicopportunities5)
        dest.writeString(addtlInfo1)
        dest.writeString(admissionspriority11)
        dest.writeString(admissionspriority21)
        dest.writeString(attendanceRate)
        dest.writeString(bbl)
        dest.writeString(bin)
        dest.writeString(boro)
        dest.writeString(borough)
        dest.writeString(buildingCode)
        dest.writeString(bus)
        dest.writeString(censusTract)
        dest.writeString(city)
        dest.writeString(code1)
        dest.writeString(collegeCareerRate)
        dest.writeString(communityBoard)
        dest.writeString(councilDistrict)
        dest.writeString(dbn)
        dest.writeString(diplomaendorsements)
        dest.writeString(eligibility1)
        dest.writeString(ellPrograms)
        dest.writeString(endTime)
        dest.writeString(extracurricularActivities)
        dest.writeString(faxNumber)
        dest.writeString(finalgrades)
        dest.writeString(girls)
        dest.writeString(grade9geapplicants1)
        dest.writeString(grade9geapplicantsperseat1)
        dest.writeString(grade9gefilledflag1)
        dest.writeString(grade9swdapplicants1)
        dest.writeString(grade9swdapplicantsperseat1)
        dest.writeString(grade9swdfilledflag1)
        dest.writeString(grades2018)
        dest.writeString(graduationRate)
        dest.writeString(interest1)
        dest.writeString(languageClasses)
        dest.writeString(latitude)
        dest.writeString(location)
        dest.writeString(longitude)
        dest.writeString(method1)
        dest.writeString(neighborhood)
        dest.writeString(nta)
        dest.writeString(offerRate1)
        dest.writeString(overviewParagraph)
        dest.writeString(pctStuEnoughVariety)
        dest.writeString(pctStuSafe)
        dest.writeString(phoneNumber)
        dest.writeString(primaryAddressLine1)
        dest.writeString(program1)
        dest.writeString(psalSportsBoys)
        dest.writeString(psalSportsCoed)
        dest.writeString(psalSportsGirls)
        dest.writeString(schoolAccessibilityDescription)
        dest.writeString(schoolEmail)
        dest.writeString(schoolName)
        dest.writeString(seats101)
        dest.writeString(seats9ge1)
        dest.writeString(seats9swd1)
        dest.writeString(sharedSpace)
        dest.writeString(startTime)
        dest.writeString(stateCode)
        dest.writeString(subway)
        dest.writeString(totalStudents)
        dest.writeString(website)
        dest.writeString(zip)
        dest.writeString(advancedplacementCourses)
        dest.writeString(campusName)
        dest.writeString(international)
        dest.writeString(pbat)
        dest.writeString(school10thSeats)
        dest.writeString(schoolSports)
    }

    companion object {

        @JvmField val CREATOR: Parcelable.Creator<SchoolListInfo> = object : Parcelable.Creator<SchoolListInfo> {
            override fun createFromParcel(parcel: Parcel): SchoolListInfo {
                return SchoolListInfo(parcel)
            }

            override fun newArray(size: Int): Array<SchoolListInfo?> {
                return arrayOfNulls(size)
            }
        }
    }
}
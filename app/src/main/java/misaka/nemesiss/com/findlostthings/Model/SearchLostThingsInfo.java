package misaka.nemesiss.com.findlostthings.Model;

public class SearchLostThingsInfo
{
    private int ThingCatId;
    private int ThingDetailId;
    private int SchoolId;
    private int SchoolBuildingId;
    private int ItemStatus;
    private int SortType;
    private int IsAdvancedSort=0;
    private String AdvancedSortText=null;
    private long FoundDateBeginUnix;
    private long FoundDateEndUnix;

    public int getThingDetailId()
    {
        return ThingDetailId;
    }

    public int getThingCatId()
    {
        return ThingCatId;
    }

    public int getIsAdvancedSort()
    {
        return IsAdvancedSort;
    }

    public int getItemStatus()
    {
        return ItemStatus;
    }

    public int getSchoolBuildingId()
    {
        return SchoolBuildingId;
    }

    public int getSchoolId()
    {
        return SchoolId;
    }

    public int getSortType()
    {
        return SortType;
    }

    public long getFoundDateBeginUnix()
    {
        return FoundDateBeginUnix;
    }

    public long getFoundDateEndUnix()
    {
        return FoundDateEndUnix;
    }

    public String getAdvancedSortText()
    {
        return AdvancedSortText;
    }

    public void setThingDetailId(int thingDetailId)
    {
        ThingDetailId = thingDetailId;
    }

    public void setThingCatId(int thingCatId)
    {
        ThingCatId = thingCatId;
    }

    public void setAdvancedSortText(String advancedSortText)
    {
        AdvancedSortText = advancedSortText;
    }

    public void setFoundDateBeginUnix(long foundDateBeginUnix)
    {
        FoundDateBeginUnix = foundDateBeginUnix;
    }

    public void setFoundDateEndUnix(long foundDateEndUnix)
    {
        FoundDateEndUnix = foundDateEndUnix;
    }

    public void setIsAdvancedSort(int isAdvancedSort)
    {
        IsAdvancedSort = isAdvancedSort;
    }

    public void setItemStatus(int itemStatus)
    {
        ItemStatus = itemStatus;
    }

    public void setSchoolBuildingId(int schoolBuildingId)
    {
        SchoolBuildingId = schoolBuildingId;
    }

    public void setSchoolId(int schoolId)
    {
        SchoolId = schoolId;
    }

    public void setSortType(int sortType)
    {
        SortType = sortType;
    }

}
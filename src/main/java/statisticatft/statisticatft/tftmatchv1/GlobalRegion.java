package statisticatft.statisticatft.tftmatchv1;

public enum GlobalRegion {
    AMERICAS("americas"),//NA and SA
    ASIA("asia"),//KR and JP
    EUROPE("europe"),//EU, TR and RU
    SEA("sea");//SEA and OCE?????????????????

    public String value;
    GlobalRegion(String value) {
        this.value = value;
    }

}

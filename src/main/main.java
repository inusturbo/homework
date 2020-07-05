package main;

import process.CSVUtil;
import process.DatabaseUtil;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        DatabaseUtil.addCol("cyycxsj", "double");
        DatabaseUtil.addCol("dxyy1", "double");
        DatabaseUtil.addCol("dzswgl", "double");
        DatabaseUtil.addCol("gdsxj1", "double");
        DatabaseUtil.addCol("jsjjnxl", "double");
        DatabaseUtil.addCol("jx", "double");
        DatabaseUtil.addCol("mkszyjbyl", "double");
        DatabaseUtil.addCol("sxddxyyfljc", "double");
        DatabaseUtil.addCol("ty1", "double");

        ArrayList<String[]> Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2010秋电商10_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("dxwlsy", "double");
        DatabaseUtil.addCol("dxyy3", "double");
        DatabaseUtil.addCol("gllysltj", "double");
        DatabaseUtil.addCol("jsff", "double");
        DatabaseUtil.addCol("jsjzcylyxtjg", "double");
        DatabaseUtil.addCol("mxdxcxsj", "double");
        DatabaseUtil.addCol("sxjm", "double");
        DatabaseUtil.addCol("szljyszxt", "double");
        DatabaseUtil.addCol("ty3", "double");
        DatabaseUtil.addCol("xxds", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2011秋电商10_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsff", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxjm", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[10]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[11]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2011秋电商11_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("dxwlj", "double");
        DatabaseUtil.addCol("dxyy2", "double");
        DatabaseUtil.addCol("dzswrssx", "double");
        DatabaseUtil.addCol("gdsxj2", "double");
        DatabaseUtil.addCol("gcxly", "double");
        DatabaseUtil.addCol("sjjg", "double");
        DatabaseUtil.addCol("sjjgyczhxl", "double");
        DatabaseUtil.addCol("ty2", "double");
        DatabaseUtil.addCol("zgjxdsgy", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2011春电子商务10_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswrssx", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjg", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjgyczhxl", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("j2eejs", "double");
        DatabaseUtil.addCol("dzswwl", "double");
        DatabaseUtil.addCol("jsjwl", "double");
        DatabaseUtil.addCol("lssx", "double");
        DatabaseUtil.addCol("mxdxxtfxysj", "double");
        DatabaseUtil.addCol("sjksjy", "double");
        DatabaseUtil.addCol("sffx", "double");
        DatabaseUtil.addCol("wlaq", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2012秋10商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "j2eejs", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxxtfxysj", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjksjy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffx", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlaq", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2012秋11商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsff", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxjm", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[10]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[11]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2012秋12商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        DatabaseUtil.addCol("javayycxsj", "double");
        DatabaseUtil.addCol("webjsjyy", "double");
        DatabaseUtil.addCol("czxt", "double");
        DatabaseUtil.addCol("dxyy4", "double");
        DatabaseUtil.addCol("mzdsxhzgtsshzyll", "double");
        DatabaseUtil.addCol("mxdxbcsj", "double");
        DatabaseUtil.addCol("sjkylyyy", "double");
        DatabaseUtil.addCol("ty4", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2012春商务10_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("xkdl", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2012春商务11_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswrssx", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjg", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xkdl", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        DatabaseUtil.addCol("javayycxsj", "double");
        DatabaseUtil.addCol("webjsjyy", "double");
        DatabaseUtil.addCol("czxt", "double");
        DatabaseUtil.addCol("dxyy4", "double");
        DatabaseUtil.addCol("mzdsxhzgtsshzyll", "double");
        DatabaseUtil.addCol("mxdxbcsj", "double");
        DatabaseUtil.addCol("sjkylyyy", "double");
        DatabaseUtil.addCol("ty4", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2012春商务10_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("dzswalfx", "double");
        DatabaseUtil.addCol("jjfx", "double");
        DatabaseUtil.addCol("wgjjx", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013秋10电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswalfx", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jjfx", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wgjjx", Valueslist.get(i)[4]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013秋11电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "j2eejs", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxxtfxysj", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjksjy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffx", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlaq", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013秋12电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsff", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxjm", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[10]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[11]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013秋13电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("aqdzswxtsj", "double");
        DatabaseUtil.addCol("dzswaq", "double");
        DatabaseUtil.addCol("dzswjsyxtsj", "double");
        DatabaseUtil.addCol("dzswxtpc", "double");
        DatabaseUtil.addCol("dzswzfyqs", "double");
        DatabaseUtil.addCol("wlyx", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013春电商10_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "aqdzswxtsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswaq", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswjsyxtsj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswxtpc", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswzfyqs", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlyx", Valueslist.get(i)[7]);


                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013春电商11_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[8]);

                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2013春电商12_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswrssx", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjg", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[9]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xkdl", Valueslist.get(i)[10]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("bysj", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014春10商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "bysj", Valueslist.get(i)[2]);
                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014春11商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "aqdzswxtsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswaq", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswjsyxtsj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswxtpc", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswzfyqs", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlyx", Valueslist.get(i)[7]);


                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014春12商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[8]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[8]);

                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014春13商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswrssx", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjg", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xkdl", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014秋11级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswalfx", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jjfx", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wgjjx", Valueslist.get(i)[4]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014秋12级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "j2eejs", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxxtfxysj", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjksjy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffx", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlaq", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014秋13级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsff", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxjm", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[10]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[11]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        DatabaseUtil.addCol("xsytk", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2014秋14级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[9]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xsytk", Valueslist.get(i)[10]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015春12级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "aqdzswxtsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswaq", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswalfx", Valueslist.get(i)[3]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswjsyxtsj", Valueslist.get(i)[4]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswxtpc", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswzfyqs", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlyx", Valueslist.get(i)[7]);


                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }

        DatabaseUtil.addCol("dzswwl", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015春13级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        DatabaseUtil.addCol("mxdxcxsj", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015春14级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015秋12级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jjfx", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wgjjx", Valueslist.get(i)[3]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015秋13级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "j2eejs", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxxtfxysj", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjksjy", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffx", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlaq", Valueslist.get(i)[8]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015秋14级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjgyczhxl", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[9]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2015秋15级商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xsytk", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016春12商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "bysj", Valueslist.get(i)[2]);
                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016春13商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "aqdzswxtsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswaq", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswjsyxtsj", Valueslist.get(i)[3]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswxtpc", Valueslist.get(i)[4]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswzfyqs", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlyx", Valueslist.get(i)[6]);
                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }

        DatabaseUtil.addCol("linuxcxsj", "double");
        DatabaseUtil.addCol("xxaq", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016春14商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "linuxcxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[8]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxaq", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        DatabaseUtil.addCol("szfx", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016春14商务_2.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "linuxcxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lxsx", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szfx", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxaq", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("sjkzhxl", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016春15商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkzhxl", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016秋13商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswalfx", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jjfx", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wgjjx", Valueslist.get(i)[4]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("javaeejs", "double");
        DatabaseUtil.addCol("dzswwlygylgl", "double");
        DatabaseUtil.addCol("dzswxtfxysj", "double");
        DatabaseUtil.addCol("jsjtxx", "double");
        DatabaseUtil.addCol("jsjwlzhxl", "double");
        DatabaseUtil.addCol("swznysjwj", "double");
        DatabaseUtil.addCol("sffxysj", "double");
        DatabaseUtil.addCol("xxaqzhsx", "double");
        DatabaseUtil.addCol("ydrjkf", "double");
        DatabaseUtil.addCol("yjs", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016秋14商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javaeejs", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwlygylgl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswxtfxysj", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjtxx", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwl", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwlzhxl", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "swznysjwj", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffx", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffxysj", Valueslist.get(i)[9]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxaqzhsx", Valueslist.get(i)[9]);
                } else if (j == 12) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ydrjkf", Valueslist.get(i)[9]);
                } else if (j == 13) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "yjs", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016秋15商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjg", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjgyczhxl", Valueslist.get(i)[8]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[9]);
                } else if (j == 12) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("jsll", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2016秋16商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsll", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[9]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xsytk", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("erpglyyy", "double");
        DatabaseUtil.addCol("dsjgl", "double");
        DatabaseUtil.addCol("rjgcpzygl", "double");
        DatabaseUtil.addCol("rjkfzhxl", "double");
        DatabaseUtil.addCol("xnxsjs", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017春14商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "erpglyyy", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dsjgl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswzfyqs", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "rjkfzhxl", Valueslist.get(i)[6]);
                }
            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017春15商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "linuxcxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szfx", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017春16商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkzhxl", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017秋14商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wlyx", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "wgjjx", Valueslist.get(i)[3]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        DatabaseUtil.addCol("rjgc", "double");
        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017秋15商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javaeejs", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswxtfxysj", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwl", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjwlzhxl", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "rjgc", Valueslist.get(i)[6]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "swznysjwj", Valueslist.get(i)[7]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffx", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sffxysj", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxaq", Valueslist.get(i)[9]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxaqzhsx", Valueslist.get(i)[9]);
                } else if (j == 12) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ydrjkf", Valueslist.get(i)[9]);
                } else if (j == 13) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "yjs", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017秋16商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "javayycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlsy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy3", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswgl", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gllysltj", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjzcylyxtjg", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mkszyjbyl", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjg", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjjgyczhxl", Valueslist.get(i)[8]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty3", Valueslist.get(i)[9]);
                } else if (j == 12) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xxds", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2017秋17商务_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "cyycxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy1", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj1", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsll", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jsjjnxl", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "jx", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "szljyszxt", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sxddxyyfljc", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty1", Valueslist.get(i)[9]);
                } else if (j == 11) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "xsytk", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2018春14电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "bysj", Valueslist.get(i)[2]);
                }
                System.out.println("main:main()  ###成绩插入成功");
            }
        }

        DatabaseUtil.addCol("rjzdhcsjs", "double");
        DatabaseUtil.addCol("zjjjs", "double");

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2018春15电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "erpglyyy", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dsjgl", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswzfyqs", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mzdsxhzgtsshzyll", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "rjkfzhxl", Valueslist.get(i)[6]);
                }
            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2018春16电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "linuxcxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }

        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2018春16电商_2.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "linuxcxsj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "webjsjyy", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "czxt", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy4", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dzswwl", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "lssx", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxbcsj", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty4", Valueslist.get(i)[9]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


        Valueslist = new ArrayList<String[]>();
        CSVUtil.readValues("E:\\bigdatainput\\2018春17电商_1.csv", Valueslist);
        for (int i = 0; i < Valueslist.size(); i++) {
            for (int j = 0; j < Valueslist.get(i).length; j++) {
                if (j == 0) {
                    if (!DatabaseUtil.isAvailable(Valueslist.get(i)[j])) {
                        DatabaseUtil.addNewStudent(Valueslist.get(i)[j]);
                    }
                } else if (j == 2) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxwlj", Valueslist.get(i)[2]);
                } else if (j == 3) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "dxyy2", Valueslist.get(i)[3]);
                } else if (j == 4) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gdsxj2", Valueslist.get(i)[4]);
                } else if (j == 5) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "gcxly", Valueslist.get(i)[5]);
                } else if (j == 6) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "mxdxcxsj", Valueslist.get(i)[5]);
                } else if (j == 7) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkylyyy", Valueslist.get(i)[6]);
                } else if (j == 8) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "sjkzhxl", Valueslist.get(i)[7]);
                } else if (j == 9) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "ty2", Valueslist.get(i)[8]);
                } else if (j == 10) {
                    DatabaseUtil.updateGrade(Valueslist.get(i)[0], "zgjxdsgy", Valueslist.get(i)[8]);
                }

            }
            System.out.println("main:main()  ###成绩插入成功");
        }


    }
}

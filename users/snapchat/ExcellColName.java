package snapchat;

import New.ExcelSheetColumnNumber;
/*
 * http://itjob.io/post/249
 * Microsoft Excel的列名具有这样的模式 A,B,C,...,Z,AA,AB,AC,...,AZ,BA,BB,...ZZ,AAA,AAB,...,等等，换句话说第一列是A，第二列是B，第27列是AA
给定一个列编号，求对应的列名，比如
输入          输出
 26             Z
 51             AY
 52             AZ
 80             CB
 676            YZ
 702            ZZ
 705            AAC
 可以相互转换
 其实是 26进制和10进制转换
 */
public class ExcellColName extends ExcelSheetColumnNumber{
}

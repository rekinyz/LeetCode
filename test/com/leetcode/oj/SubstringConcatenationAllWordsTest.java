package com.leetcode.oj;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SubstringConcatenationAllWordsTest {
	SubstringConcatenationAllWords scaw = new SubstringConcatenationAllWords();

	@Test
	public void testFindSubstring0() {
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		Integer[] expected = { 0, 9 };
		assertArrayEquals(expected, findSubstring(s, words));
	}

	@Test
	public void testFindSubstring1() {
		String s = "barfoothefoobarolamanbarfoothefooolabarman";
		String[] words = { "foo", "bar", "ola" };
		Integer[] expected = { 9, 30 };
		assertArrayEquals(expected, findSubstring(s, words));
	}

	@Test
	public void testFindSubstring2() {
		String s = "bartfootthenfootbartmann";
		String[] words = { "foot", "bart" };
		Integer[] expected = { 0, 12 };
		assertArrayEquals(expected, findSubstring(s, words));
	}

	@Test
	public void testFindSubstring3() {
		String s = "bartfootfthenfootfbarftmann";
		String[] words = { "f", "t" };
		Integer[] expected = { 3, 7, 8, 16, 21 };
		assertArrayEquals(expected, findSubstring(s, words));
	}

	@Test
	public void testFindSubstring4() {
		String s = "bartfootfthennotfofbarfotomann";
		String[] words = { "fo", "ot" };
		Integer[] expected = { 4, 14 };
		assertArrayEquals(expected, findSubstring(s, words));
	}

	@Test
	public void testFindSubstring5() {
		String s = "";
		String[] words = { "fo", "ot" };
		Integer[] expected = {};
		assertArrayEquals(expected, findSubstring(s, words));
	}

	@Test
	public void testFindSubstring6() {
		String s = "";
		String[] words = {};
		Integer[] expected = {};
		assertArrayEquals(expected, findSubstring(s, words));
	}
	
	@Test
	public void testFindSubstring7() {
		String s = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
		String[] words = {"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"};
		Integer[] expected = {936};
		assertArrayEquals(expected, findSubstring(s, words));
	}
	
	private Integer[] findSubstring(String s, String[] words) {
		List<Integer> list = scaw.findSubstring(s, words);
		return (Integer[]) list.toArray(new Integer[list.size()]);
	}
}

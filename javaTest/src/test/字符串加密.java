package test;

/*
* 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词属于字母表的下面，如下所示：

A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

T R A I L B Z E S C D F G H J K M N O P Q U V W X Y

上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。

请实现下述接口，通过指定的密匙和明文得到密文。*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class 字符串加密 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sr = "";
        while ((sr = br.readLine()) != null) {
            StringBuilder bu = new StringBuilder();
            String sr1 = br.readLine();
            HashSet<Character> set = new LinkedHashSet<Character>();
            for (int i = 0; i < sr.length(); i++)
                set.add(sr.charAt(i));
            for (int i = 0; i < 26; i++)
                set.add((char) (i + 'a'));
            char ch[] = new char[set.size()];
            Iterator iter = set.iterator();
            for (int i = 0; i < ch.length && iter.hasNext(); i++)
                ch[i] = (Character) iter.next();
            for (int i = 0; i < sr1.length(); i++) {
                if (Character.isLowerCase(sr1.charAt(i)))
                    bu.append(Character.toLowerCase(ch[sr1.charAt(i) - 'a']));
                else
                    bu.append(Character.toUpperCase(ch[sr1.charAt(i) - 'A']));
            }
            System.out.println(bu);
        }
    }
}
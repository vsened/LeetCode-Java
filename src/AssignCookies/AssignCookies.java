package AssignCookies;

import java.util.Arrays;

/** <b>Assign Cookies</b>
 * <p>
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at
 * most one cookie.
 * </p>
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i
 * will be content. Your goal is to maximize the number of your content children and output the maximum number.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        var content = 0;
        var kid = 0;
        var cookie = 0;
        while (kid < g.length && cookie < s.length) {
            if (g[kid] <= s[cookie]) {
                content++;
                kid++;
                cookie++;
            } else {
                cookie++;
            }
        }
        return content;
    }
}

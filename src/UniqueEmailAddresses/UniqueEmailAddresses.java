package UniqueEmailAddresses;

import java.util.HashMap;
/**
 * Unique Email Addresses.
 * Every valid email consists of a local name and a domain name, separated by the '@' sign.
 * Besides lowercase letters, the email may contain one or more '.' or '+'.
 *
 * - For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 *
 * If you add periods '.' between some characters in the local name part of an email address, mail sent there
 * will be forwarded to the same address without dots in the local name. Note that this rule does not apply
 * to domain names.
 *
 * - For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 *
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows
 * certain emails to be filtered. Note that this rule does not apply to domain names.
 *
 * - For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 *
 * It is possible to use both of these rules at the same time.
 *
 * Given an array of strings emails where we send one email to each emails[i], return the number of different
 * addresses that actually receive mails.
 * */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        var dict = new HashMap<String, Integer>();
        for (var email :
                emails) {
            var currentEmail = email.split("@");
            var name = currentEmail[0].replace(".", "").split("\\+");
            var clearEmail = String.format("%s@%s", name[0], currentEmail[1]);
            if (!dict.containsKey(clearEmail))
                dict.put(clearEmail, 1);
        }
        return dict.size();
    }
}
/*
String text = text
            .replaceAll("%", "%25")   // Процент
            .replaceAll(" ", "%20")   // Пробел
            .replaceAll("\t", "%20")  // Табуляция (заменяем на пробел)
            .replaceAll("\n", "%20")  // Переход строки (заменяем на пробел)
            .replaceAll("\r", "%20")  // Возврат каретки (заменяем на пробел)
            .replaceAll("!", "%21")   // Восклицательный знак
            .replaceAll("\"", "%22")  // Двойная кавычка
            .replaceAll("#", "%23")   // Октоторп, решетка
            .replaceAll("\\$", "%24") // Знак доллара
            .replaceAll("&", "%26")   // Амперсанд
            .replaceAll("'", "%27")   // Одиночная кавычка
            .replaceAll("\\(", "%28") // Открывающаяся скобка
            .replaceAll("\\)", "%29") // Закрывающаяся скобка
            .replaceAll("\\*", "%2a") // Звездочка
            .replaceAll("\\+", "%2b") // Знак плюс
            .replaceAll(",", "%2c")   // Запятая
            .replaceAll("-", "%2d")   // Дефис
            .replaceAll("\\.", "%2e") // Точка
            .replaceAll("/", "%2f")   // Слеш, косая черта
            .replaceAll(":", "%3a")   // Двоеточие
            .replaceAll(";", "%3b")   // Точка с запятой
            .replaceAll("<", "%3c")   // Открывающаяся угловая скобка
            .replaceAll("=", "%3d")   // Знак равно
            .replaceAll(">", "%3e")   // Закрывающаяся угловая скобка
            .replaceAll("\\?", "%3f") // Вопросительный знак
            .replaceAll("@", "%40")   // At sign, по цене, собачка
            .replaceAll("\\[", "%5b") // Открывающаяся квадратная скобка
            .replaceAll("\\\\", "%5c") // Одиночный обратный слеш '\'
            .replaceAll("\\]", "%5d") // Закрывающаяся квадратная скобка
            .replaceAll("\\^", "%5e") // Циркумфлекс
            .replaceAll("_", "%5f")   // Нижнее подчеркивание
            .replaceAll("`", "%60")   // Гравис
            .replaceAll("\\{", "%7b") // Открывающаяся фигурная скобка
            .replaceAll("\\|", "%7c") // Вертикальная черта
            .replaceAll("\\}", "%7d") // Закрывающаяся фигурная скобка
            .replaceAll("~", "%7e");  // Тильда

 */
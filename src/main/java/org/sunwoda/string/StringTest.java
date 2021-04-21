package org.sunwoda.string;

import redis.clients.jedis.Jedis;

/**
 * Description:
 *
 * @author shiguorang
 * @date 2021-04-21 14:37:06
 */
public class StringTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.select(0);
        jedis.set("sex", "男");
        String sex = jedis.get("sex");
        System.out.println(sex);
        String age = jedis.get("age");
        System.out.println(age);
        jedis.close();
    }
}

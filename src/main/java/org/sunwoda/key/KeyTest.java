package org.sunwoda.key;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Description:
 *
 * @author shiguorang
 * @date 2021-04-21 14:22:24
 */
public class KeyTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.select(0);
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }

//        Long name = jedis.del("name");
//        System.out.println(name);
        String name = jedis.type("name");
        System.out.println(name);

        jedis.close();
    }
}

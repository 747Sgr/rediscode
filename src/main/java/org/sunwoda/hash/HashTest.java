package org.sunwoda.hash;

import redis.clients.jedis.Jedis;

/**
 * Description:
 *
 * @author shiguorang
 * @date 2021-04-21 14:48:29
 */
public class HashTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.hset("rng", "name", "xiaoming");
        String hget = jedis.hget("rng", "name");
        System.out.println(hget);

        jedis.close();
    }
}

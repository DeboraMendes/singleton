package com.designPattern.creational.singleton;

import com.designPattern.creational.singleton.connection.Connection;
import com.designPattern.creational.singleton.connection.ConnectionManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * O Singleton, também conhecido como carta única,
 * é um padrão de projeto criacional que permite garantir que uma classe tenha apenas uma instância,
 * enquanto provê um ponto de acesso global para essa instância.
 */
@RunWith(MockitoJUnitRunner.class)
public class SingletonTest {

    /**
     * Deve testar se a instância é a mesma para ambos os objetos.
     */
    @Test
    public void test() {
        Connection connection1 = ConnectionManager.getConnection();
        Connection connection2 = ConnectionManager.getConnection();
        Assert.assertEquals(connection1, connection2);
    }

}
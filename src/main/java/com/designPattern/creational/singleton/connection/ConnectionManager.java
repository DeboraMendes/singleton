package com.designPattern.creational.singleton.connection;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Responsável por gerenciar a conexão.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConnectionManager {

    /**
     * O atributo é estático, existirá apenas uma conexão.
     */
    private static Connection connection;

    /**
     * Reponsável por retornar a conexão.
     * Caso a conexão ainda não exista, será criada e depois retornada.
     * Caso a conexão já exista, será apenas retornada.
     *
     * @return conexão.
     */
    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }

}

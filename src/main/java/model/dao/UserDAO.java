/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.UserBEAN;
import model.db.ConnectionFactory;
import model.interf.DAOInterf;

/**
 *
 * @author Usuario
 */
public class UserDAO implements DAOInterf<UserBEAN> {

    private Connection conn = null;
    private PreparedStatement stmt = null;

    public UserDAO() {
        conn = ConnectionFactory.getConnection();
    }

    @Override
    public void add(UserBEAN e) {
        try {
            stmt = conn.prepareStatement("insert into user(nick,name,role,email,password) values(?,?,?,?,?);");
            stmt.setString(1, e.getNick());
            stmt.setString(2, e.getName());
            stmt.setString(3, e.getRole());
            stmt.setString(4, e.getEmail());
            stmt.setString(5, e.getPassword());
            stmt.execute();
            stmt.close();
        } catch (Exception ex) {

        }
    }

    @Override
    public void update(UserBEAN e) {
        try {
            stmt = conn.prepareStatement("update user set nick = ?, name = ?, role = ?, email = ?, password = ? where id = ?;");
            stmt.setString(1, e.getNick());
            stmt.setString(2, e.getName());
            stmt.setString(3, e.getRole());
            stmt.setString(4, e.getEmail());
            stmt.setString(5, e.getPassword());
            stmt.setInt(6, e.getId());
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception ex) {

        }
    }

    @Override
    public UserBEAN search(int id) {
        UserBEAN ub = new UserBEAN().init();
        try {
            stmt = conn.prepareStatement("select * from user where id = ?;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ub = new UserBEAN(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
            rs.close();
            stmt.close();
        } catch (Exception ex) {
        }
        return ub;
    }

    @Override
    public void remove(int id) {
        try {
            stmt = conn.prepareCall("delete from user where id = ?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception ex) {
        }
    }

    public List<UserBEAN> listarALL() {
        ArrayList<UserBEAN> al = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from user;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                UserBEAN ub = new UserBEAN(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));

                al.add(ub);
            }
            rs.close();
            stmt.close();
        } catch (Exception ex) {
        }
        return al;
    }

}

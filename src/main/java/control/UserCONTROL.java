package control;

import java.util.List;
import model.bean.UserBEAN;
import model.dao.UserDAO;
import model.interf.DAOInterf;

public class UserCONTROL implements DAOInterf<UserBEAN> {

    private UserDAO udao = new UserDAO();

    @Override
    public void add(UserBEAN e) {
        udao.add(e);
    }

    @Override
    public void update(UserBEAN e) {
        udao.update(e);
    }

    @Override
    public UserBEAN search(int id) {
        for (UserBEAN userBEAN : listarALL()) {
            if (userBEAN.getId() == id) {
                return userBEAN;
            }
        }
        return new UserBEAN().init();
    }

    @Override
    public void remove(int id) {
        udao.remove(id);
    }

    public List<UserBEAN> listarALL() {
        return udao.listarALL();
    }

    private UserBEAN searchByNick(String nick) {
        UserBEAN ub = new UserBEAN().init();
        for (UserBEAN userBEAN : listarALL()) {
            if (userBEAN.getNick().equalsIgnoreCase(nick)) {
                ub = userBEAN;
            }
        }
        return ub;
    }

    private UserBEAN searchByEmail(String email) {
        UserBEAN ub = new UserBEAN().init();
        for (UserBEAN userBEAN : listarALL()) {
            if (userBEAN.getEmail().equalsIgnoreCase(email)) {
                ub = userBEAN;
            }
        }
        return ub;
    }

    public UserBEAN getUserByValidator(String validator) {
        UserBEAN ubret = new UserBEAN().init();
        UserBEAN ub = searchByEmail(validator);
        if (ub.getId() != -1) {
            ubret = ub;
        } else {
            ub = searchByNick(validator);
            if (ub.getId() != -1) {
                ubret = ub;
            }
        }
        return ubret;
    }

    public int authenticate(String validator, String password) {
        UserBEAN ub = getUserByValidator(validator);
        int id = -1;
        if (ub.getId() == -1) {
            id = -1;
        } else {
            if (ub.getPassword().equals(password)) {
                id = 1;
            } else {
                id = 0;
            }
        }
        return id;
    }
}

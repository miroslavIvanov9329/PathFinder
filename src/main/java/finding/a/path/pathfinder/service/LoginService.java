package finding.a.path.pathfinder.service;

import finding.a.path.pathfinder.exceptions.NotRegisteredUserException;
import finding.a.path.pathfinder.exceptions.NotValidPasswordException;
import finding.a.path.pathfinder.model.dto.UserLoginDTO;

public interface LoginService {
    boolean login(UserLoginDTO userLoginDTO) throws NotRegisteredUserException, NotValidPasswordException;
}

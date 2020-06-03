package egov.mailbot.utils;

import egov.mailbot.models.Mapping;
import org.egov.common.contract.request.Role;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    //TODO Render HTML with table via mustache later
    public static String getErrorBody(List<Mapping> mappings){
        StringBuilder sb = new StringBuilder("Greetings! \nThe subject used is invalid! Please find below the " +
                "allowed operations configured for your email \n\n");

        mappings.forEach( mapping -> {
            sb.append("OPERATION: ").append(mapping.getDescription()).append("\nSUBJECTS: ").append(String.join(" OR ",
                    mapping.getSubject())).append(
                    "\n\n");
        });

        sb.append("Thanks.");
        return sb.toString();
    }

    public static String maskEmail(String email){
        if(email == null)
            return "";
        return email.replaceAll("(^[^@]{3}|(?!^)\\G)[^@]", "$1*");
    }

    public static List<String> roleCodes(List<Role> roles){
        return roles.stream().map(Role::getCode).collect(Collectors.toList());
    }
}
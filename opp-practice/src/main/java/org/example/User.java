package org.example;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void initPassword(PasswordGenerator passwordGenerator){
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();

        /**
         * 랜덤 패스워드가 8자 이상 12자 이하일 경우만 패스워드에 랜덤 패스워드를 세팅해준다.
         */
        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }


    }
}

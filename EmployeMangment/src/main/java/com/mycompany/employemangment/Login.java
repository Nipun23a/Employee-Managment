/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employemangment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame {

    // Components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private static User loggedInUser;
    private static Login instance;
    public static Login getInstance(){
        if(instance==null){
        instance = new Login();
        }
        return instance;
    }

    // User data storage
    private ArrayList<User> users;

    public Login() {
        setTitle("Login Screen");
        setSize(400, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initializeUserData();
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLabel.setText("Login");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                                        .addComponent(passwordField)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(166, 166, 166)
                                                .addComponent(loginButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(173, 173, 173)
                                                .addComponent(titleLabel)))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(titleLabel)
                                .addGap(38, 38, 38)
                                .addComponent(usernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(loginButton)
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                char[] enteredPasswordChars = passwordField.getPassword();
                String enteredPassword = new String(enteredPasswordChars);

                if (isValidLogin(enteredUsername, enteredPassword)) {
                    JOptionPane.showMessageDialog(Login.this, "Login Successful!");
                    setVisible(false);
                    openProjectDashboard();
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Invalid username or password. Try again.");
                    // TODO: Add code for unsuccessful login
                }

                // Clear the fields after login attempt
                usernameField.setText("");
                passwordField.setText("");
            }
        });



        setVisible(true);
    }

    private void initializeUserData() {
        users = new ArrayList<>();
        users.add(new User("Admin", "admin", "7949", "ADMIN"));
    }

    private boolean isValidLogin(String enteredUsername, String enteredPassword) {
        for (User user : users) {
            if (user.getUsername().equals(enteredUsername) && user.getPassword().equals(enteredPassword)) {
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }
    public static User getLoggedInUser(){
        return loggedInUser;
    }
    private ArrayList<User> getUsers(){
        return users;
    }
    

    
    
    private void openProjectDashboard(){
            SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    new Dashboard().setVisible(true);
                    dispose();
                }
            });
    }
    public ArrayList<User> getusers(){
    return users;
    }
    
}

-- Admin, password is `nooneguessthis`
INSERT INTO oauth_client_details (client_id, client_secret, scope, authorized_grant_types, authorities)
  VALUES ('admin', '{bcrypt}$2a$10$puAvl7zsvbEOQWzaL8r2C.hcmai/E3cDgh0Bt3M2HI84mOg4WJdcG', 'read,write', 'password,refresh_token,client_credentials', 'ROLE_ADMIN');

-- Resourse server that wanna check token, password is `ololo`
INSERT INTO oauth_client_details (client_id, client_secret, scope, authorized_grant_types, authorities)
  VALUES ('resource', '{bcrypt}$2a$10$G6Fs/hOO8fzy9/H5GBkOYOsij2R0aVOaP9Ru/VOVghxUpLTEnNDc.', 'read,write', 'password,refresh_token,client_credentials', 'ROLE_RESOURCE');

-- The encrypted client_secret it `secret`
INSERT INTO oauth_client_details (client_id, client_secret, scope, authorized_grant_types, authorities, access_token_validity, refresh_token_validity)
  VALUES ('clientId', '{bcrypt}$2a$10$vCXMWCn7fDZWOcLnIEhmK.74dvK1Eh8ae2WrWlhr2ETPLoxQctN4.', 'read,write', 'password,refresh_token,client_credentials', 'ROLE_CLIENT', 40, 50);




-- The encrypted password is `pass`
INSERT INTO users (id, username, password, enabled) VALUES (1, 'user', '{bcrypt}$2a$10$cyf5NfobcruKQ8XGjUJkEegr9ZWFqaea6vjpXWEaSqTa2xL9wjgQC', 1);
INSERT INTO users (id, username, password, enabled) VALUES (2, 'guest', '{bcrypt}$2a$10$cyf5NfobcruKQ8XGjUJkEegr9ZWFqaea6vjpXWEaSqTa2xL9wjgQC', 1);



INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_GUEST');

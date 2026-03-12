CREATE TABLE dinossaur (
                           id BIGINT NOT NULL AUTO_INCREMENT,
                           nome VARCHAR(100) NOT NULL,
                           tipo VARCHAR(50) NOT NULL,
                           peso DOUBLE NOT NULL,
                           periodo VARCHAR(50) NOT NULL,
                           dieta VARCHAR(100) NOT NULL,
                           PRIMARY KEY (id)
);

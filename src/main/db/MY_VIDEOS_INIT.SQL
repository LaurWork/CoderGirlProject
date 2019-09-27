CREATE SCHEMA My_Videos authorization sa;

CREATE TABLE MY_VIDEOS.VIDEOS (
ID INT PRIMARY KEY,
TITLE VARCHAR(255) DEFAULT ‘ ‘,
AREA VARCHAR(255) DEFAULT ‘ ‘,
WEBADDRESS VARCHAR(255) DEFAULT ‘ ‘);


INSERT INTO my_videos.videos values (4, 'How to Escape a Sinking Car', 'Garage', 'https://www.youtube.com/watch?v=gUD53NZ03zM');

INSERT INTO my_videos.videos values (5, 'How to Parallel Park', 'Garage', 'https://www.youtube.com/watch?v=l4LcfZeS4qw');

INSERT INTO my_videos.videos values (3, ‘How to Fill Out a W4’, ‘Office’, ‘https://www.youtube.com/watch?v=c_1DifHtUWA');

INSERT INTO my_videos.videos values (2, ‘How to Tie a Tie’, ‘Bedroom’, ‘https://www.youtube.com/watch?v=wOLUCYb-Xsk');

INSERT INTO my_videos.videos values (1, ‘How to Fold a Fitted Sheet’, ‘Bedroom’, ‘https://www.youtube.com/watch?v=YHTyH2nuFAw);

SELECT * FROM MY_VIDEOS.VIDEOS;
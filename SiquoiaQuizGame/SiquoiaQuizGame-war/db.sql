create table user(
    user_id number,
    user_name varchar(45),
    password varchar(45),
    email varchar(45),
    userType varchar(4),
    first_name varchar(45),
    middle_name varchar(45),
    last_name varchar(45),
    primary key(user_id)
);


create table title(
    title_id number,
    submit_level number,
    answer_level number,
    title_name varchar(100),
    primary key(title_id)
);

create table achievement(
    user_id number,
    played_quizzes number,
    submit_level number,
    answer_level number,
    no_of_titles number,
    reward_points number,
    primary key(user_id) references user(user_id),
    foreign key(answer_level) references title(answer_level),
    foreign key(submit_level) references title(submit_level)
);

create table admin(
    user_id number,
    user_name varchar(45),
    password varchar(45),
    email varchar(45),
    company_name varchar(100),
    primary key(user_id)
);

create table category(
    category_id number,
    parent_id number,
    name varchar(45),
    primary key(category_id),
    foreign key(parent_id) references category(category_id)
);

create table quiz(
    quiz_id number,
    user_id number,
    correct_answers number,
    name varchar(45),
    category_id number,
    primary key(quiz_id),
    foreign key(category_id) references category(category_id),
    foreign key(user_id) references user(user_id)
);

create table question(
    question_id number,
    category_id number,
    question varchar(500),
    option1 varchar(500),
    option2 varchar(500),
    option3 varchar(500),
    correct_option varchar(500),
    primary key(question_id),
    foreign key(category_id) references category(category_id)
);

create table payment(
    payment_id number,
    user_id number,
    item_id number,
    payment_type varchar(100),
    primary key(payment_id),
    foreign key(user_id) references user(user_id),
    foreign key(item_id) references quiz(quiz_id)
);
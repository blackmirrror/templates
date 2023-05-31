# Практики
## #14. Spring MVC, REST API
* Создание классов и полей
* Создание контроллеров
* Создание, вывод, удаление через Postman
## #15. Hibernate
* SQL таблицы в mySQL
* Теперь объекты хранятся в бд
* Классы стали entity
* Добавили application.properties
## #16. Связь OneToMany
* У таблицы Posts появилась колонка user_id
* У класса User есть OneToMany связь, прикручена к user_id
## #17. Criteria API
* Добавлен фильтр по юзерам (новый метод и путь)
##  #18. Spring Data JPA
* Добавлены репозитории и сервисы, интерфейсы для них
## #19. Logback
* Добавлен logback.xml
* При сохранении юзера или получениия юзера выходит лог, прописан в сервисе
## #20. Spring AOP. Pointcut, JoinPoint, Advice
* Добавлено время выполнения кажждого сервиса (service.Logging)
## #21. @Transactional, @Async
* У каждого метода сервиса добавлен @Transactional
* В application.properties добавлены переменные почты
* Создан EmailService с @Async
## #22. Scheduler
* Создан SchedulerService, генерит текстовые бд каждые 30 мин
* Добавлен AppConfig с аннотациями
## #23. Spring Security (auth)
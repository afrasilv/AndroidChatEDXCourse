package com.afrasilv.androidchatedxcourse.addcontact;

public class AddContactInteractorImpl implements AddContactInteractor {
    AddContactRepositoryImpl addContactRepository;

    public AddContactInteractorImpl(AddContactRepositoryImpl addContactRepository) {
        this.addContactRepository = addContactRepository;
    }

    @Override
    public void execute(String email) {
        addContactRepository.addContact(email);
    }
}
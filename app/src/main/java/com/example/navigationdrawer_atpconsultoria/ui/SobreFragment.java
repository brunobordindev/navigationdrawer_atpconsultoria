package com.example.navigationdrawer_atpconsultoria.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer_atpconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      // View view = inflater.inflate(R.layout.fragment_sobre, container, false);
        String descricao = "A ATPM Consultoria tem como missão aopiar organizações" +
                "que desejam alcançar o sucesso atráves da excelência em gestão e " +
                "da busca pela qualidade";

        Element versao = new Element();
        versao.setTitle("Versão 1.0.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Redes sociais")
                .addFacebook("bruno.bordin.96", "Facebook")
                .addInstagram("brunorodriguesbordin", "Instagram")
                .addYoutube("brunobordin", "YouTube")
                .addGitHub("bruno28051988", "GitHub")

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://fkconsulting.pro/recuperacao-judicial/?gclid=Cj0KCQiAmeKQBhDvARIsAHJ7mF7Isf4AtDjPiwba8LrJvNKJnsMKs3D1D7oIELGmAscy4brdVx_r0WQaAupMEALw_wcB", "Acesse o site")

                .addItem(versao)
                .create();
    }
}
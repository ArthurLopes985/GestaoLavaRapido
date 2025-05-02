
package gestaolavarapido.view;

import gestaolavarapido.DAO.AgendaServicosDAO;
import gestaolavarapido.DAO.TipoServicoDAO;
import gestaolavarapido.controller.AgendaServicosController;
import gestaolavarapido.controller.ClienteController;
import gestaolavarapido.controller.TipoServicoController;
import gestaolavarapido.model.AgendaServicos;
import gestaolavarapido.model.Cliente;
import gestaolavarapido.model.TipoServico;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InterfaceLavaRapido extends javax.swing.JFrame {


    public InterfaceLavaRapido() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TelaCadastro = new javax.swing.JPanel();
        nomefield = new javax.swing.JTextField();
        cpffield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        telefonefield = new javax.swing.JTextField();
        placafield = new javax.swing.JTextField();
        nometxt = new javax.swing.JLabel();
        cpftxt = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        telefonetxt = new javax.swing.JLabel();
        placatxt = new javax.swing.JLabel();
        cadastrarbutton = new javax.swing.JButton();
        TelaAgenda = new javax.swing.JPanel();
        buscacpffield = new javax.swing.JTextField();
        buscacpftxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaagenda = new javax.swing.JTable();
        buscaragendabutton = new javax.swing.JButton();
        TelaAgendar = new javax.swing.JPanel();
        nomeagendarfield = new javax.swing.JTextField();
        dataagendarfield = new javax.swing.JTextField();
        statusagendarfield = new javax.swing.JTextField();
        nomeagendartxt = new javax.swing.JLabel();
        dataagendartxt = new javax.swing.JLabel();
        statusagendartxt = new javax.swing.JLabel();
        tiposervicotxt = new javax.swing.JLabel();
        salvarangedamentobutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelatiposagendar = new javax.swing.JTable();
        TelaGerenciarTipo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelatipos = new javax.swing.JTable();
        idtipofield = new javax.swing.JTextField();
        nometipofield = new javax.swing.JTextField();
        descricaofield = new javax.swing.JTextField();
        precofield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salvartipobutton = new javax.swing.JButton();
        editarbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        info3 = new javax.swing.JLabel();
        logoetitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomefieldActionPerformed(evt);
            }
        });

        nometxt.setText("Nome:");

        cpftxt.setText("CPF:");

        emailtxt.setText("Email:");

        telefonetxt.setText("Telefone:");

        placatxt.setText("Placa do Veículo:");

        cadastrarbutton.setText("CADASTRAR");
        cadastrarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaCadastroLayout = new javax.swing.GroupLayout(TelaCadastro);
        TelaCadastro.setLayout(TelaCadastroLayout);
        TelaCadastroLayout.setHorizontalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nometxt)
                    .addComponent(emailtxt)
                    .addComponent(cpftxt))
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(44, 332, Short.MAX_VALUE)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TelaCadastroLayout.createSequentialGroup()
                                .addComponent(placatxt)
                                .addGap(18, 18, 18)
                                .addComponent(placafield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaCadastroLayout.createSequentialGroup()
                                .addComponent(telefonetxt)
                                .addGap(37, 37, 37)
                                .addComponent(telefonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpffield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(cadastrarbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        TelaCadastroLayout.setVerticalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nometxt)
                            .addComponent(nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonetxt)
                            .addComponent(telefonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpftxt)
                            .addComponent(cpffield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placatxt))
                .addGap(7, 7, 7)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt))
                .addGap(49, 49, 49)
                .addComponent(cadastrarbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar Novo Cliente", TelaCadastro);

        buscacpffield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscacpffieldActionPerformed(evt);
            }
        });

        buscacpftxt.setText("CPF do cliente a ser buscado:");

        tabelaagenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Data", "Tipo de servico", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaagenda);

        buscaragendabutton.setText("PROCURAR");
        buscaragendabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaragendabuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaAgendaLayout = new javax.swing.GroupLayout(TelaAgenda);
        TelaAgenda.setLayout(TelaAgendaLayout);
        TelaAgendaLayout.setHorizontalGroup(
            TelaAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAgendaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(buscacpftxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscacpffield, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscaragendabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(TelaAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        TelaAgendaLayout.setVerticalGroup(
            TelaAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAgendaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TelaAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscacpffield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscacpftxt)
                    .addComponent(buscaragendabutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Agenda do Cliente", TelaAgenda);

        nomeagendarfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeagendarfieldActionPerformed(evt);
            }
        });

        dataagendarfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataagendarfieldActionPerformed(evt);
            }
        });

        nomeagendartxt.setText("Nome:");

        dataagendartxt.setText("Data:");

        statusagendartxt.setText("Status:");

        tiposervicotxt.setText("Tipo de servico:");

        salvarangedamentobutton.setText("SALVAR");
        salvarangedamentobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarangedamentobuttonActionPerformed(evt);
            }
        });

        tabelatiposagendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço"
            }
        ));
        TipoServicoDAO tipodao = new TipoServicoDAO();
        List<TipoServico> tipos;
        try {
            tipos = tipodao.listartipos();

            DefaultTableModel model = (DefaultTableModel) tabelatiposagendar.getModel();
            model.setRowCount(0);

            for (TipoServico ts : tipos) {
                model.addRow(new Object[]{
                    ts.getId(),
                    ts.getNome(),
                    ts.getDescricao(),
                    ts.getPreco()
                });
            }  // esse codigo pega na dao de tiposervico um select que lista todos os tipos e salva na tabela tabelatiposgendar
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
        } // catch para caso aconteca algum erro na conexão e chamada com banco de dados.
        jScrollPane3.setViewportView(tabelatiposagendar);

        javax.swing.GroupLayout TelaAgendarLayout = new javax.swing.GroupLayout(TelaAgendar);
        TelaAgendar.setLayout(TelaAgendarLayout);
        TelaAgendarLayout.setHorizontalGroup(
            TelaAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAgendarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TelaAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TelaAgendarLayout.createSequentialGroup()
                        .addGroup(TelaAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaAgendarLayout.createSequentialGroup()
                                .addComponent(nomeagendartxt)
                                .addGap(18, 18, 18)
                                .addComponent(nomeagendarfield, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(statusagendartxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(statusagendarfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaAgendarLayout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(salvarangedamentobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(dataagendartxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataagendarfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaAgendarLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(tiposervicotxt))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        TelaAgendarLayout.setVerticalGroup(
            TelaAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAgendarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(TelaAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeagendartxt)
                    .addGroup(TelaAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeagendarfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(statusagendartxt)
                        .addComponent(statusagendarfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataagendartxt)
                        .addComponent(dataagendarfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tiposervicotxt)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarangedamentobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Novo Agendamento", TelaAgendar);

        tabelatipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço"
            }
        ));
        try {
            tipos = tipodao.listartipos();

            DefaultTableModel model = (DefaultTableModel) tabelatipos.getModel();
            model.setRowCount(0);

            for (TipoServico ts : tipos) {
                model.addRow(new Object[]{
                    ts.getId(),
                    ts.getNome(),
                    ts.getDescricao(),
                    ts.getPreco()
                });
            }  // esse codigo pega na dao de tiposervico um select que lista todos os tipos e salva na tabela tabelatiposgendar
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
        } // catch para caso aconteca algum erro na conexão e chamada com banco de dados.
        jScrollPane2.setViewportView(tabelatipos);

        idtipofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtipofieldActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Preço:");

        salvartipobutton.setText("SALVAR");
        salvartipobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvartipobuttonActionPerformed(evt);
            }
        });

        editarbutton.setText("EDITAR");
        editarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarbuttonActionPerformed(evt);
            }
        });

        deletebutton.setText("DELETAR");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        info1.setForeground(new java.awt.Color(255, 0, 0));
        info1.setText("- PARA CADASTRAR NOVO NÃO É NECESSARIO DIGITAR O ID E CLICAR NO BOTÃO SALVAR.");

        info2.setForeground(new java.awt.Color(255, 0, 0));
        info2.setText("- PARA EDITAR PREENCHER TODAS INFOS E CLICAR NO BOTÃO EDITAR.");

        info3.setForeground(new java.awt.Color(255, 0, 0));
        info3.setText("- PARA DELETAR CLICAR NO A SER DELETADO NA TABELA E CLICAR NO BOTÃO DELETAR.");

        javax.swing.GroupLayout TelaGerenciarTipoLayout = new javax.swing.GroupLayout(TelaGerenciarTipo);
        TelaGerenciarTipo.setLayout(TelaGerenciarTipoLayout);
        TelaGerenciarTipoLayout.setHorizontalGroup(
            TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaGerenciarTipoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaGerenciarTipoLayout.createSequentialGroup()
                        .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descricaofield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(nometipofield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idtipofield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precofield)))
                    .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(salvartipobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(TelaGerenciarTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info1)
                    .addComponent(info2)
                    .addComponent(info3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaGerenciarTipoLayout.setVerticalGroup(
            TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaGerenciarTipoLayout.createSequentialGroup()
                .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaGerenciarTipoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaGerenciarTipoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtipofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nometipofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(TelaGerenciarTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(salvartipobutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletebutton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gerenciar Tipos de Servico", TelaGerenciarTipo);

        logoetitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logolavarapido.png"))); // NOI18N
        logoetitulo.setText("GERENCIAMENTO DO LAVA RAPIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logoetitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoetitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomefieldActionPerformed

    private void dataagendarfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataagendarfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataagendarfieldActionPerformed

    private void nomeagendarfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeagendarfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeagendarfieldActionPerformed

    private void idtipofieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtipofieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtipofieldActionPerformed

    private void salvartipobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvartipobuttonActionPerformed
        String nome = nometipofield.getText();
        String descricao = descricaofield.getText();
        String precotx = precofield.getText();
        //pega os dados digitados nos campos da view e aramzena em atributos.
        if (nome.isEmpty() || descricao.isEmpty() || precotx.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos Nome, Descrição e Preço.");
            return;
        }// verifica se algum deles esta vazio.
        double preco;
        try {
            preco = Double.parseDouble(precotx);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço inválido. Digite um número.");
            return;
        }
        //transforma o preco pego em string em double.
        if (preco >= 9999.99) {
             JOptionPane.showMessageDialog(null, "O preco deve ser menor que 9999.99"); 
             return;
        }//verifica se o preco tem tamanho correto, para dar certo no bd.
        else{
        TipoServico tipo = new TipoServico(0, nome, descricao, preco);//passa os dados pra classe tiposervico.
        TipoServicoController controller = new TipoServicoController(0, nome, descricao, preco);// passa os dados pro controller de tiposervico.
        try {
            controller.cadastrarTipo(tipo);//executa o metodo de cadastro no banco de dados.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro: não foi possível realizar a operação. Tente novamente."); //tratamento de erros.
        }

        JOptionPane.showMessageDialog(null, "Tipo de Servico cadastrado com sucesso!");
        idtipofield.setText("");
        nometipofield.setText("");
        descricaofield.setText("");
        precofield.setText("");
        atualizarTabelaTipoServico();
        }// mensagem de sucesso e limpa os campos digitados e atualiza as tabelas com tipo.
    }//GEN-LAST:event_salvartipobuttonActionPerformed

    private void cadastrarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarbuttonActionPerformed
        String nome = nomefield.getText();
        String cpf = cpffield.getText();
        String email = emailfield.getText();
        String telefone = telefonefield.getText();
        String placa = placafield.getText();
        //pega os dados digitados nos campos da view e aramzena em atributos.
        
        if (cpf.isEmpty() || nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || placa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
        }// verifica se algum deles esta vazio.
        else if (cpf.length() != 11) {
             JOptionPane.showMessageDialog(null, "O CPF deve conter exatamente 11 dígitos.");
        }//verifica se o cpf esta no tamanho correto.
        else if (placa.length() != 7) {
             JOptionPane.showMessageDialog(null, "A placa deve conter exatamente 7 dígitos.");
        }//verifica se a placa esta no tamanho correto.
        else{
        Cliente cliente = new Cliente(nome, cpf, telefone, email, placa);//passa os dados pra classe cliente.
        ClienteController controller = new ClienteController(nome, cpf, telefone, email, placa);// passa os dados pro controller de cliente.
        try {
            controller.cadastrarCliente(cliente);//executa o metodo de cadastro no banco de dados.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro: não foi possível realizar a operação. Tente novamente."); //tratamento de erros.
        }

        JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        nomefield.setText("");
        cpffield.setText("");
        emailfield.setText("");
        telefonefield.setText("");
        placafield.setText("");
        }// mensagem de sucesso e limpa os campos digitados.
    }//GEN-LAST:event_cadastrarbuttonActionPerformed

    private void buscacpffieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscacpffieldActionPerformed

    }//GEN-LAST:event_buscacpffieldActionPerformed

    private void buscaragendabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaragendabuttonActionPerformed
        String cpf = buscacpffield.getText();
        //aramzena o cpf digitado em um atriubto.
        if (cpf.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo.");
        }//verifica se ele nao esta vazio.
        else if(cpf.length() != 11){
            JOptionPane.showMessageDialog(null, "O cpf deve conter exatamente 11 digitos");
        }//verifica se ele possui o tamanho correto.
        else{
            try{
                AgendaServicosDAO agendadao = new AgendaServicosDAO();//conecta com agendaservicosdao.
                List<AgendaServicos> servicos = agendadao.buscarServicosporCpf(cpf);//executa o metodo de busca e cria uma lista.
                
                DefaultTableModel model = (DefaultTableModel) tabelaagenda.getModel();
                model.setRowCount(0);

                for (AgendaServicos ag : servicos) {
                    model.addRow(new Object[]{
                    ag.getCliente(),
                    ag.getData(),
                    ag.getTipo_servico(),
                    ag.getStatus()
                    });//armazena os dados achados com metodo de busca e armazena na lista.
                buscacpffield.setText("");
                }
                if (servicos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                }//mensagem caso não seja achado nada.
            }
            catch(Exception ex){
                ex.printStackTrace();
            JOptionPane.showMessageDialog(TelaAgenda, "Erro ao buscar consultas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }//tratamento de erros.
        }
    }//GEN-LAST:event_buscaragendabuttonActionPerformed

    private void salvarangedamentobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarangedamentobuttonActionPerformed
        String nome = nomeagendarfield.getText();
        String data = dataagendarfield.getText();
        String status = statusagendarfield.getText();
        int linhaSelecionada = tabelatiposagendar.getSelectedRow();//aramzena os daods digitados e selcionados em atributos.
        if (nome.isEmpty() || data.isEmpty() || status.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos campos.");
        }//verifica se nada esta vazio.
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(TelaAgendar, "Selecione um tipo de serviço.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;//verifca se algo foi selecionado.
        }
        DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dataFormatada;
        try {
            dataFormatada = LocalDate.parse(data, entrada);
        } catch (DateTimeParseException d) {
            JOptionPane.showMessageDialog(null, "Data inválida. Use o formato dd/MM/yyyy.");
            return;
        }//formata a data da maneira correta para nenhum erro ao passar pro banco de dados e verifica se não houve erro de digitação do usuario.

        String nometipo = (String) tabelatiposagendar.getValueAt(linhaSelecionada, 1);
        AgendaServicos agenda = new AgendaServicos(nome, dataFormatada, nometipo, status);//passa os dados pra classe agendaservicos.
        AgendaServicosController controller = new AgendaServicosController(nome, dataFormatada, nometipo, status);//passa os dados pra agendaservicoscontroller.
        try {
            controller.agendarServico(agenda);//conecta com o metodo de agendar na controller.
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(TelaAgendar, "Erro ao agendar " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(TelaAgendar, "Erro ao agendar " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
        }//tratamento de erros.
        JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso ");
        nomeagendarfield.setText("");
        dataagendarfield.setText("");
        statusagendarfield.setText("");
        //mensagem de sucesso e limpa os campos digitados.
    }//GEN-LAST:event_salvarangedamentobuttonActionPerformed

    private void editarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarbuttonActionPerformed
        String idtx = idtipofield.getText();
        String nome = nometipofield.getText();
        String descricao = descricaofield.getText();
        String precotx = precofield.getText();
        //pega os dados digitados nos campos da view e aramzena em atributos.
        if (idtx.isEmpty()  || nome.isEmpty() || descricao.isEmpty() || precotx.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return;
        }// verifica se algum deles esta vazio.
        int id;
        try {
            id = Integer.parseInt(idtx);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Id inválido. Digite um número.");
            return;
        }//tranforma o id digitado em integer.
        
        boolean encontrado = false;
        int totalLinhas = tabelatipos.getRowCount();

        for (int i = 0; i < totalLinhas; i++) {
            int idNaTabela = (int) tabelatipos.getValueAt(i, 0);
            if (idNaTabela == id) {
                encontrado = true;
                break;
            }
        }//faz uma contagem em todas linhas da tabela, para ver se acha o id digitado pelo usuario.
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "ID não encontrado.");
            return;
        } //mensagem caso o id não seja encontrado.
        double preco;
        try {
            preco = Double.parseDouble(precotx);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço inválido. Digite um número.");
            return;
        }
        //transforma o preco pego em string em double.
        if (preco >= 9999.99) {
             JOptionPane.showMessageDialog(null, "O preco deve ser menor que 9999.99"); 
             return;
        }//verifica se o preco tem tamanho correto, para dar certo no bd.
        
        else{
        TipoServico tipo = new TipoServico(id, nome, descricao, preco);//passa os dados pra classe tiposervico.
        TipoServicoController controller = new TipoServicoController(id, nome, descricao, preco);// passa os dados pro controller de tiposervico.
        try {
            controller.editarTipo(tipo);//executa o metodo de editar no banco de dados.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro: não foi possível realizar a operação. Tente novamente."); //tratamento de erros.
        }

        JOptionPane.showMessageDialog(null, "Tipo de Servico atualizado com sucesso!");
        idtipofield.setText("");
        nometipofield.setText("");
        descricaofield.setText("");
        precofield.setText("");
        atualizarTabelaTipoServico();
        }// mensagem de sucesso e limpa os campos digitados e atualiza as tabelas com tipo.
    }//GEN-LAST:event_editarbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
         String idtx = idtipofield.getText();
        //pega os dado digitado no campo da view e aramzena em atributo.
        if (idtx.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo ID.");
            return;
        }// verifica se algum deles esta vazio.
        
        int id;
        try {
            id = Integer.parseInt(idtx);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Id inválido. Digite um número.");
            return;
        }//tranforma o id digitado em integer.
        
        boolean encontrado = false;
        int totalLinhas = tabelatipos.getRowCount();

        for (int i = 0; i < totalLinhas; i++) {
            int idNaTabela = (int) tabelatipos.getValueAt(i, 0);
            if (idNaTabela == id) {
                encontrado = true;
                break;
            }
        }//faz uma contagem em todas linhas da tabela, para ver se acha o id digitado pelo usuario.
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "ID não encontrado.");
            return;
        } //mensagem caso o id não seja encontrado.
        else{
        TipoServico tipo = new TipoServico(id, "nome", "descricao", 0.0);//passa os dados pra classe tiposervico.
        TipoServicoController controller = new TipoServicoController(id, "nome", "descricao", 0.0);// passa os dados pro controller de tiposervico.
        try {
            controller.apagarTipo(tipo);//executa o metodo de cadastro no banco de dados.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceLavaRapido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro: não foi possível realizar a operação. Tente novamente."); //tratamento de erros.
        }

        JOptionPane.showMessageDialog(null, "Tipo de Servico deletado com sucesso!");
        idtipofield.setText("");
        nometipofield.setText("");
        descricaofield.setText("");
        precofield.setText("");
        atualizarTabelaTipoServico();
        }// mensagem de sucesso e limpa os campos digitados e atualiza as tabelas com tipo.
    }//GEN-LAST:event_deletebuttonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLavaRapido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaAgenda;
    private javax.swing.JPanel TelaAgendar;
    private javax.swing.JPanel TelaCadastro;
    private javax.swing.JPanel TelaGerenciarTipo;
    private javax.swing.JTextField buscacpffield;
    private javax.swing.JLabel buscacpftxt;
    private javax.swing.JButton buscaragendabutton;
    private javax.swing.JButton cadastrarbutton;
    private javax.swing.JTextField cpffield;
    private javax.swing.JLabel cpftxt;
    private javax.swing.JTextField dataagendarfield;
    private javax.swing.JLabel dataagendartxt;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField descricaofield;
    private javax.swing.JButton editarbutton;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel emailtxt;
    private javax.swing.JTextField idtipofield;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel info3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logoetitulo;
    private javax.swing.JTextField nomeagendarfield;
    private javax.swing.JLabel nomeagendartxt;
    private javax.swing.JTextField nomefield;
    private javax.swing.JTextField nometipofield;
    private javax.swing.JLabel nometxt;
    private javax.swing.JTextField placafield;
    private javax.swing.JLabel placatxt;
    private javax.swing.JTextField precofield;
    private javax.swing.JButton salvarangedamentobutton;
    private javax.swing.JButton salvartipobutton;
    private javax.swing.JTextField statusagendarfield;
    private javax.swing.JLabel statusagendartxt;
    private javax.swing.JTable tabelaagenda;
    private javax.swing.JTable tabelatipos;
    private javax.swing.JTable tabelatiposagendar;
    private javax.swing.JTextField telefonefield;
    private javax.swing.JLabel telefonetxt;
    private javax.swing.JLabel tiposervicotxt;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabelaTipoServico() {
    try {
        TipoServicoDAO dao = new TipoServicoDAO();
        List<TipoServico> lista = dao.listartipos();

        DefaultTableModel model = (DefaultTableModel) tabelatipos.getModel();
        DefaultTableModel model1 = (DefaultTableModel) tabelatiposagendar.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        for (TipoServico ts : lista) {
            model.addRow(new Object[]{
                ts.getId(),
                ts.getNome(),
                ts.getDescricao(),
                ts.getPreco()
            });
        }
        for (TipoServico ts1 : lista) {
            model1.addRow(new Object[]{
                ts1.getId(),
                ts1.getNome(),
                ts1.getDescricao(),
                ts1.getPreco()
            });
       }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao atualizar a tabela: " + e.getMessage());
    }
} //metodo de atualizacao das tabelas quando algum operação de editar, cadastrar ou deletar é feita nas tabelas de tipo de servico.

}

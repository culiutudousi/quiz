import React from 'react';
import { Menu } from 'antd';
import { MailOutlined, AppstoreOutlined, SettingOutlined } from '@ant-design/icons';
import 'antd/dist/antd.css';
import {BrowserRouter, HashRouter, Route, Switch, Link, useRouteMatch} from 'react-router-dom';
import ShoppingList from '../ShoppingList';
import AddGood from '../AddGood';
import OrderList from '../OrderList';

const SHOPPING_LIST = 'SHOPPING_LIST';
const ORDER_LIST = 'ORDER_LIST';
const ADD_GOOD = 'ADD_GOOD';

class ShopppingApplication extends React.Component {
    state = {
        current: SHOPPING_LIST
    };

    handleMenuClick = e => {
        console.log('click ', e);
        this.setState({ current: e.key });
    };
    
    render() {
        const { current } = this.state;
        return (
            <BrowserRouter>
                <Menu onClick={this.handleMenuClick} selectedKeys={[current]} mode="horizontal">
                    <Menu.Item key={SHOPPING_LIST} icon={<MailOutlined />}>
                        <Link to="/">商城</Link>
                    </Menu.Item>
                    <Menu.Item key={ORDER_LIST} icon={<MailOutlined />}>
                        <Link to="/order-list">订单</Link>
                    </Menu.Item>
                    <Menu.Item key={ADD_GOOD} icon={<MailOutlined />}>
                        <Link to="/add-good">添加商品</Link>
                    </Menu.Item>
                </Menu>
                <Switch>
                    <Route path="/add-good" component={AddGood}/>
                    <Route path="/order-list" component={OrderList}/>
                    <Route path="/" component={ShoppingList}/>
                </Switch>
            </BrowserRouter>
        );
    }
}

export default ShopppingApplication;

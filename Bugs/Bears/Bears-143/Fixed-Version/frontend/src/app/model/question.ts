/**
 * H2MS API
 * API for interacting with the H2MS backend.
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import { EventTemplate } from './eventTemplate';


export interface Question {
    answerType?: string;
    eventTemplate?: EventTemplate;
    id?: number;
    options?: Array<string>;
    priority?: number;
    question?: string;
    required?: boolean;
    _links?: QuestionLink;
}

interface QuestionLink {
    self?: Link;
    question?: Link;
    eventTemplate?: Link;
}

interface Link {
    href?: string;
}
